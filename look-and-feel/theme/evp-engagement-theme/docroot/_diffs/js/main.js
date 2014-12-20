AUI().ready(
	'event-outside',
	'event-mouseenter',
	'liferay-navigation-interaction',
	'liferay-sign-in-modal',
	function(A) {
		var navigation = A.one('#navigation');

		if (navigation) {
			navigation.plug(Liferay.NavigationInteraction);
		}

		var signIn = A.one('a#sign-in');

		if (signIn && signIn.getData('redirect') !== 'true') {
			signIn.plug(Liferay.SignInModal);
		}

		var noLogin = A.one('.nologin-main-menu');

		if (noLogin) {
			noLogin.on(
				'click',
				function() {
					if (!navigation.hasClass('open')) {
						closing = noLogin.once(
							'clickoutside',
							function() {
								navigation.removeClass('open');
							}
						);
					}

					navigation.toggleClass('open');
				}
			);
		}

		// Dockbar vertical JS, if dockbar is present

		var portletDockbar = A.one('.portlet-dockbar');

		if (portletDockbar) {
			var body = A.one('body');

			var toggleDockbar = A.one('a.user-avatar-link');
			var toggleDockbarLeave = A.one('.portlet-dockbar .dockbar');

			if (toggleDockbar) {
				toggleDockbar.on(
					'mouseenter',
					function() {
						body.removeClass('over');

						closingDockbar = toggleDockbarLeave.once(
							'clickoutside',
							function() {
								body.addClass('over');
							}
						);
					}
				);
			}
		}
	}
);
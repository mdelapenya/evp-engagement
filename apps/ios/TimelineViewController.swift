//
//  TimelineViewController.swift
//  4Life
//
//  Created by jmWork on 19/12/14.
//  Copyright (c) 2014 Liferay. All rights reserved.
//

import UIKit

class TimelineViewController: UIViewController {

	var scrollView: UIScrollView!
	
	override func viewDidLoad() {
		super.viewDidLoad()
		// Do any additional setup after loading the view, typically from a nib.
		scrollView = UIScrollView(frame: view.bounds)
		scrollView.setTranslatesAutoresizingMaskIntoConstraints(false)
		view.addSubview(scrollView)
		
		view.addConstraints([
			NSLayoutConstraint(item: scrollView, attribute: .Left, relatedBy: .Equal, toItem: view, attribute: .Left, multiplier: 1.0, constant: 0),
			NSLayoutConstraint(item: scrollView, attribute: .Top, relatedBy: .Equal, toItem: view, attribute: .Top, multiplier: 1.0, constant: 0),
			NSLayoutConstraint(item: scrollView, attribute: .Right, relatedBy: .Equal, toItem: view, attribute: .Right, multiplier: 1.0, constant: 0),
			NSLayoutConstraint(item: scrollView, attribute: .Bottom, relatedBy: .Equal, toItem: view, attribute: .Bottom, multiplier: 1.0, constant: 0)
			])
		
		let timeline = TimelineView(bulletType: .Arrow, timeFrames: [
			TimeFrame(text: "", date: "Almost landing!", image: nil),
			TimeFrame(text: "", date: "We arrived!", image: UIImage(named: "timeline-1")),
			TimeFrame(text: "Life consists of all kinds of experiences. Some experiences are common, and we can go through them every day like having a tasty meal.\nThen there are those other experiences", date: "Life-changing experiences", image: UIImage(named: "timeline-2")),
			TimeFrame(text: "They don't have many of the creature comforts that we have, and they live with different disabilities - yet they are happy. Genuinely happy. The result is that their happiness feels very pure, and innocent. That kind of happiness is infectious. We went to the orphanage to love on the children, but it almost felt like the opposite - the staff and kids wanted to show love to us.", date: "Meeting these kids can change your life", image: UIImage(named: "timeline-5")),
			TimeFrame(text: "I will never forget this boy I got to spend time with in one of the houses. He always sat on the floor and played with a rubik's cube. I sat in front of him, and right away he gave me this little plastic duck so I could play next to him. I tried talking to him, but he was very quiet. I don't remember how it happened, but I took the duck and walked it across his back, making quacking sounds. He couldn't stop laughing and laughing. If I stopped, then he would take the duck and put it back in my hands, gesturing for me to keep on tickling him with the duck.", date: "These kids are truly happy", image: UIImage(named: "timeline-3")),
			TimeFrame(text: "From the outside it feels like these orphans don't have much. They don't have money, or gadgets, or lots of toys. They don't have their actual family. We thought that we would have to work hard to bring light and joy into their lives. But we quickly realized that they are already full of joy. The children are well cared for, they have everything they need. They have good food everyday, they have comfortable homes, and they have each other, the caretakers, the teachers, and the staff as their family", date: "Orphans are full of joy", image: UIImage(named: "timeline-4"))
			])
		scrollView.addSubview(timeline)
		scrollView.addConstraints([
			NSLayoutConstraint(item: timeline, attribute: .Left, relatedBy: .Equal, toItem: scrollView, attribute: .Left, multiplier: 1.0, constant: 0),
			NSLayoutConstraint(item: timeline, attribute: .Bottom, relatedBy: .LessThanOrEqual, toItem: scrollView, attribute: .Bottom, multiplier: 1.0, constant: 0),
			NSLayoutConstraint(item: timeline, attribute: .Top, relatedBy: .Equal, toItem: scrollView, attribute: .Top, multiplier: 1.0, constant: 0),
			NSLayoutConstraint(item: timeline, attribute: .Right, relatedBy: .Equal, toItem: scrollView, attribute: .Right, multiplier: 1.0, constant: 0),
			
			NSLayoutConstraint(item: timeline, attribute: .Width, relatedBy: .Equal, toItem: scrollView, attribute: .Width, multiplier: 1.0, constant: 0)
			])
	}

}

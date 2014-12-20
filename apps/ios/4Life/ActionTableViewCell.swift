//
//  ActionTableViewCell.swift
//  4Life
//
//  Created by jmWork on 19/12/14.
//  Copyright (c) 2014 Liferay. All rights reserved.
//

import UIKit

class ActionTableViewCell: UITableViewCell {

	@IBOutlet weak var img: JBKenBurnsView?
	@IBOutlet weak var staticImg: UIImageView?

	var images: [UIImage]?

    override func awakeFromNib() {
        super.awakeFromNib()
    }

	override func setHighlighted(highlighted: Bool, animated: Bool) {
/*
		if img == nil || staticImg == nil {
			return
		}

		println("high -> \(highlighted)")
		if highlighted {
			UIView.animateWithDuration(0.5, animations: { () -> Void in
				self.staticImg?.alpha = 0.0
				return
			})
			img?.animateWithImages(images,
					transitionDuration: 5, initialDelay: 0, loop: true, isLandscape: true)
		}
		else {
			img?.stopAnimation()
			UIView.animateWithDuration(0.5, animations: { () -> Void in
				self.staticImg?.alpha = 1.0
				return
			})
		}
*/
	}

    override func setSelected(selected: Bool, animated: Bool) {
        super.setSelected(selected, animated: animated)


        // Configure the view for the selected state
    }
    
}

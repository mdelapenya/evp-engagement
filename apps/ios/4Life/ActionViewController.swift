//
//  ActionViewController.swift
//  4Life
//
//  Created by jmWork on 19/12/14.
//  Copyright (c) 2014 Liferay. All rights reserved.
//

import UIKit

class ActionViewController: UIViewController,UIImagePickerControllerDelegate,UINavigationControllerDelegate {

	@IBOutlet weak var header: JBKenBurnsView?

	private let imagePicker = UIImagePickerController()

	@IBAction func pictureClick(sender: AnyObject) {
			presentViewController(imagePicker, animated: true) {}
	}

	@IBAction func postClick(sender: AnyObject) {
		let vc = PostViewController(nibName:"PostViewController", bundle:nil)

		self.navigationController?.pushViewController(vc, animated:true)
	}

	
	@IBAction func timelineClick(sender: AnyObject) {
		let vc = TimelineViewController(nibName:"TimelineViewController", bundle:nil)

		self.navigationController?.pushViewController(vc, animated:true)
	}

    func imagePickerController(
			picker: UIImagePickerController!,
			didFinishPickingMediaWithInfo info: [NSObject : AnyObject]!) {

		let selectedImage = info[UIImagePickerControllerOriginalImage] as? UIImage
		let selectedURL = info[UIImagePickerControllerMediaURL] as? NSURL

		imagePicker.dismissViewControllerAnimated(true) {}
	}

    func imagePickerControllerDidCancel(picker: UIImagePickerController!) {
		imagePicker.dismissViewControllerAnimated(true) {}
	}

	override func viewDidLoad() {
		super.viewDidLoad()

		imagePicker.delegate = self
		imagePicker.allowsEditing = false
		imagePicker.modalPresentationStyle = .CurrentContext
				imagePicker.sourceType = .SavedPhotosAlbum



		var imgs: [UIImage] = []

		imgs.append(UIImage(named: "a-0-0")!)
		imgs.append(UIImage(named: "a-0-1")!)
		imgs.append(UIImage(named: "a-0-2")!)
		imgs.append(UIImage(named: "a-0-3")!)

		header?.animateWithImages(imgs,
					transitionDuration: 3	, initialDelay: 0, loop: true, isLandscape: true)

	}

}

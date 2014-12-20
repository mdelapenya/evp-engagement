//
//  PostViewController.swift
//  4Life
//
//  Created by jmWork on 19/12/14.
//  Copyright (c) 2014 Liferay. All rights reserved.
//

import UIKit

class PostViewController: UIViewController {

	@IBOutlet weak var text: UITextView?

    override func viewDidLoad() {
        super.viewDidLoad()

		let btn = UIBarButtonItem(title: "Post", style: .Bordered, target: self, action: "btn")
		self.navigationItem.rightBarButtonItem = btn

		text?.becomeFirstResponder()

		text?.selectAll(nil)

        // Do any additional setup after loading the view.
    }

	func btn() {
		let vc = TimelineViewController(nibName:"TimelineViewController", bundle:nil)

		self.navigationController?.pushViewController(vc, animated:true)
	}

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepareForSegue(segue: UIStoryboardSegue, sender: AnyObject?) {
        // Get the new view controller using segue.destinationViewController.
        // Pass the selected object to the new view controller.
    }
    */

}

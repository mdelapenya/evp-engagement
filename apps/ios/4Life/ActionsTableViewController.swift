//
//  ActionsTableViewController.swift
//  4Life
//
//  Created by jmWork on 19/12/14.
//  Copyright (c) 2014 Liferay. All rights reserved.
//

import UIKit

class ActionsTableViewController: UITableViewController {

	var cells:[ActionTableViewCell] = []

    override func viewDidLoad() {
        super.viewDidLoad()

		let icon = UIImage(named: "splash")
		println(icon?.size)
		let color = UIColor(red: 212.0/255.0, green: 52.0/255.0, blue: 53.0/255.0, alpha: 1.0)
		let splashView = CBZSplashView(icon: icon, backgroundColor: color)
		splashView.animationDuration = 1.5
		splashView.iconStartSize = CGSizeMake(409/2,368/2)

		let d = UIApplication.sharedApplication().delegate as AppDelegate

		d.window?.addSubview(splashView)

var dispatchTime: dispatch_time_t = dispatch_time(DISPATCH_TIME_NOW, Int64(1 * Double(NSEC_PER_SEC)))
dispatch_after(dispatchTime, dispatch_get_main_queue(), { 

		splashView.startAnimation()
})

		var cellNib = UINib(nibName: "ActionTableViewCell", bundle: nil)
		tableView?.registerNib(cellNib, forCellReuseIdentifier: "actioncell")

		let btn = UIBarButtonItem(title: "Menu", style: .Bordered, target: self, action: "btn")
		btn.tintColor = UIColor(red: 212.0/255.0, green: 52.0/255.0, blue: 53.0/255.0, alpha: 1.0)
		self.navigationItem.leftBarButtonItem = btn

		let cell = NSBundle.mainBundle().loadNibNamed("ActionTableViewCell", owner:self, options:nil)[0] as ActionTableViewCell
		let cell2 = NSBundle.mainBundle().loadNibNamed("ActionTableViewCell", owner:self, options:nil)[0] as ActionTableViewCell
		let cell3 = NSBundle.mainBundle().loadNibNamed("ActionTableViewCell", owner:self, options:nil)[0] as ActionTableViewCell

		var imgs: [UIImage] = []

		imgs.append(UIImage(named: "a-0-0")!)
		imgs.append(UIImage(named: "a-0-1")!)
		imgs.append(UIImage(named: "a-0-2")!)
		imgs.append(UIImage(named: "a-0-3")!)

		var imgs2: [UIImage] = []

		imgs2.append(UIImage(named: "a-1-0")!)


		var imgs3: [UIImage] = []

		imgs3.append(UIImage(named: "a-2-0")!)


		cell.images = imgs;
		cell2.images = imgs2;
		cell3.images = imgs2;

		cell.staticImg?.image = imgs[0]
		cell2.staticImg?.image = imgs2[0]
		cell3.staticImg?.image = imgs3[0]

		cells.append(cell)
		cells.append(cell2)
		cells.append(cell3)
    }

	func btn() {
	    self.sideMenuViewController.openMenuAnimated(true, completion: nil)

	}

	override func tableView(tableView: UITableView, titleForHeaderInSection section: Int) -> String? {
		return "Current actions"
	}

    override func tableView(tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return 3
    }

	override func tableView(tableView: UITableView, didSelectRowAtIndexPath indexPath: NSIndexPath) {

		let vc = ActionViewController(nibName:"ActionViewController", bundle:nil)

		self.navigationController?.pushViewController(vc, animated:true)


	}
/*

	override func tableView(tableView: UITableView, didDeselectRowAtIndexPath indexPath: NSIndexPath) {
		println("de-select")

}

	override func tableView(tableView: UITableView, canMoveRowAtIndexPath indexPath: NSIndexPath) -> Bool {
println("move")
	return true
}

	override func scrollViewWillBeginDragging(scrollView: UIScrollView) {
println("scroll")
}

	override func touchesBegan(touches: NSSet, withEvent event: UIEvent) {
println("touch")
}
	override func tableView(tableView: UITableView, willSelectRowAtIndexPath indexPath: NSIndexPath) -> NSIndexPath? {
println("selec")
	return indexPath
}
*/

    override func tableView(tableView: UITableView, cellForRowAtIndexPath indexPath: NSIndexPath) -> UITableViewCell {

        return cells[indexPath.row]
    }

	override func tableView(tableView: UITableView, heightForRowAtIndexPath indexPath: NSIndexPath) -> CGFloat {

		return 220.0
	}

    /*
    // Override to support conditional editing of the table view.
    override func tableView(tableView: UITableView, canEditRowAtIndexPath indexPath: NSIndexPath) -> Bool {
        // Return NO if you do not want the specified item to be editable.
        return true
    }
    */

    /*
    // Override to support editing the table view.
    override func tableView(tableView: UITableView, commitEditingStyle editingStyle: UITableViewCellEditingStyle, forRowAtIndexPath indexPath: NSIndexPath) {
        if editingStyle == .Delete {
            // Delete the row from the data source
            tableView.deleteRowsAtIndexPaths([indexPath], withRowAnimation: .Fade)
        } else if editingStyle == .Insert {
            // Create a new instance of the appropriate class, insert it into the array, and add a new row to the table view
        }    
    }
    */

    /*
    // Override to support rearranging the table view.
    override func tableView(tableView: UITableView, moveRowAtIndexPath fromIndexPath: NSIndexPath, toIndexPath: NSIndexPath) {

    }
    */

    /*
    // Override to support conditional rearranging of the table view.
    override func tableView(tableView: UITableView, canMoveRowAtIndexPath indexPath: NSIndexPath) -> Bool {
        // Return NO if you do not want the item to be re-orderable.
        return true
    }
    */

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepareForSegue(segue: UIStoryboardSegue, sender: AnyObject?) {
        // Get the new view controller using [segue destinationViewController].
        // Pass the selected object to the new view controller.
    }
    */
    
}

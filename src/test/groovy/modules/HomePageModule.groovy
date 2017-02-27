package modules

import geb.Module

/**
 * Created by adityag on 2/23/17.
 */
class HomePageModule extends Module {

    static content = {
        electronicsLink { $('a[title="Electronics"]') }
        samsungLink {$('._1KCOnI>._3ZgIXy[title="Samsung"][href="/mobiles/samsung~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Samsung"]')}
    }

}

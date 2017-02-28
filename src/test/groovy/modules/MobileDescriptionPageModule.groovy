package modules

import geb.Module

/**
 * Created by adityag on 2/27/17.
 */
class MobileDescriptionPageModule extends Module {
    static content = {

        buyNoWButton { $('._2AkmmA._3Plo8Q._16LyaZ._7UHT_c[type="submit"]') }
        continueButton { $('.pure-g-r .pure-u-1-3 .btn.btn-orange')[0] }
        deliverHereButton { $('.address_detail.ng-scope:nth-child(2) .padding20.address-item .p:last-child') }


    }
}



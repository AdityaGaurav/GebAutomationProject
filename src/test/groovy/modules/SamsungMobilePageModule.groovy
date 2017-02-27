package modules

import geb.Module

/**
 * Created by adityag on 2/24/17.
 */
class SamsungMobilePageModule extends Module {
    static content = {
        minDropDown {$('._1QaKk1 .a_eCSK')}
        maxDropDown{$('._3nSxeA .a_eCSK')}
        priceHighToLow {$('._3fPYHw li:nth-child(3)')}
        firstMobileLink {$('._2SxMvQ .col.zZCdz4:first-child ._1UoZlX ._1-2Iqu.row .col.col-7-12 ._3wU53n:first-child')}

    }
}

package test;

import base.baseHooloovoo;
import org.junit.Before;
import org.junit.Test;
import page.hooloovooPage;

public class hooloovooTest extends baseHooloovoo {

        hooloovooPage HooloovooPage;


        @Before
            public void setUpTest(){
                HooloovooPage = new hooloovooPage();
        }

        @Test
            public void prijavaZaPosao(){

            HooloovooPage.navigateToPosaoPage();
            HooloovooPage.clickOnPridruziSeButton();
            HooloovooPage.clickOnPrijaviSeButton();
            HooloovooPage.moveToNewTab();
            HooloovooPage.applicationTextDisplayer();
            HooloovooPage.enterNameInFirstNameField();
            HooloovooPage.enterLastnameInLastnameField();
            HooloovooPage.enterEmailInEmailField();
            HooloovooPage.uploadFileFromHD();
            HooloovooPage.addCVlinkInCoverLetterField();

        }



}

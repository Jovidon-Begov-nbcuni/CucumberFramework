package com.vamUI.utilities;

import com.vamUI.pages.dashboards.DashboardPage;
import com.vamUI.pages.login_navigation.LoginPage;

public class Pages {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;



    protected LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    protected DashboardPage dashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage();
        }
        return dashboardPage;
    }

}

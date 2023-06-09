package com.liberty.apps.studio.libertyvpn

class AppSettings {
    companion object {
        //this flag will be handled by subscription
        var isUserPaid = false

        // enable admob or facebook ads, by default admob ads are enable
        // set flags true or false
        val enableAdmobAds = false
        val enableFacebookAds = false

        //place your one signal id
        val oneSignalId = "6a3c117c-cf7b-44fb-8b1c-ef78e1776daa"

        //Subscription id's
        val one_month_subscription_id = "put your one month subscription id here"
        val three_month_subscription_id = "put your three months subscription id here"
        val one_year_subscription_id = "put your one year subscription id here"
    }
}
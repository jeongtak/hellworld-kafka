
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import HelloSendManager from "./components/listers/HelloSendCards"
import HelloSendDetail from "./components/listers/HelloSendDetail"

import WorldReceiveManager from "./components/listers/WorldReceiveCards"
import WorldReceiveDetail from "./components/listers/WorldReceiveDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/hellos/sends',
                name: 'HelloSendManager',
                component: HelloSendManager
            },
            {
                path: '/hellos/sends/:id',
                name: 'HelloSendDetail',
                component: HelloSendDetail
            },

            {
                path: '/worlds/receives',
                name: 'WorldReceiveManager',
                component: WorldReceiveManager
            },
            {
                path: '/worlds/receives/:id',
                name: 'WorldReceiveDetail',
                component: WorldReceiveDetail
            },



    ]
})

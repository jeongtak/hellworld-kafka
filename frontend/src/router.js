
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import HelloSendMessageManager from "./components/listers/HelloSendMessageCards"
import HelloSendMessageDetail from "./components/listers/HelloSendMessageDetail"

import WorldReceiveMessageManager from "./components/listers/WorldReceiveMessageCards"
import WorldReceiveMessageDetail from "./components/listers/WorldReceiveMessageDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/hellos/sendMessages',
                name: 'HelloSendMessageManager',
                component: HelloSendMessageManager
            },
            {
                path: '/hellos/sendMessages/:id',
                name: 'HelloSendMessageDetail',
                component: HelloSendMessageDetail
            },

            {
                path: '/worlds/receiveMessages',
                name: 'WorldReceiveMessageManager',
                component: WorldReceiveMessageManager
            },
            {
                path: '/worlds/receiveMessages/:id',
                name: 'WorldReceiveMessageDetail',
                component: WorldReceiveMessageDetail
            },



    ]
})

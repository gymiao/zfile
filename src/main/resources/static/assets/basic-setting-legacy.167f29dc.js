!function(){var e=document.createElement("style");e.innerHTML=".zfile-admin-down-link-body[data-v-4c538bb3]{display:block}\n",document.head.appendChild(e),System.register(["./base-legacy.28cad0e5.js","./loading-legacy.a92cda73.js","./ZFormItem-legacy.19a998d2.js","./button-legacy.96a0013c.js","./input-number-legacy.2d301e91.js","./input-legacy.d4357d07.js","./radio-legacy.ac4eca21.js","./tag-legacy.1f08e7fb.js","./select-legacy.9fc0fff6.js","./scrollbar-legacy.c0fd5057.js","./popper-legacy.3e7fb573.js","./index-legacy.492b6ebd.js","./unit-legacy.203f0ef2.js","./switch-legacy.e46c6730.js","./useLinkSetting-legacy.c2769623.js","./admin-setting-legacy.2d83c4ce.js","./plugin-vue_export-helper-legacy.7bb61c33.js","./index-legacy.677ea204.js","./XCircleIcon-legacy.2726efd9.js","./index-legacy.31b96dde.js","./directive-legacy.0554e5f2.js","./event-legacy.39ad8904.js","./index-legacy.eea43e0b.js","./request-legacy.01567c6f.js","./index-legacy.ebfe533e.js","./scroll-legacy.0bcf8f62.js","./index-legacy.c304ec26.js","./_Uint8Array-legacy.5581156d.js","./debounce-legacy.45d124e9.js","./validator-legacy.0afd2ceb.js","./focus-trap-legacy.be7f3f75.js"],(function(e){"use strict";var n,l,t,u,a,o,r,i,c,d,f,s,p,m,v,b,g,y,h,V,x,w,k,_,j,P,C,L,T,U,I,z,E,R,F,D,A,M;return{setters:[function(e){n=e.D},function(){},function(e){l=e.Z,t=e.a},function(){},function(e){u=e.E},function(){},function(e){a=e.E},function(){},function(e){o=e.E,r=e.a},function(){},function(){},function(e){i=e.a,c=e.f,d=e.m,f=e.r,s=e.w,p=e.F,m=e.v,v=e.j,b=e.u,g=e.e,y=e.b,h=e.K,V=e.L,x=e.t,w=e.O,k=e.k,_=e.P,j=e.Q,P=e.R},function(e){C=e.g,L=e.a},function(e){T=e.E},function(e){U=e.u},function(e){I=e.g,z=e.t},function(e){E=e._},function(e){R=e.E},function(e){F=e.a,D=e.r},function(e){A=e.u},function(e){M=e.v},function(){},function(){},function(){},function(){},function(){},function(){},function(){},function(){},function(){},function(){}],execute:function(){function S(e,n){return i(),c("svg",{xmlns:"http://www.w3.org/2000/svg",viewBox:"0 0 24 24",fill:"currentColor","aria-hidden":"true"},[d("path",{"fill-rule":"evenodd",d:"M12 2.25a.75.75 0 01.75.75v16.19l6.22-6.22a.75.75 0 111.06 1.06l-7.5 7.5a.75.75 0 01-1.06 0l-7.5-7.5a.75.75 0 111.06-1.06l6.22 6.22V3a.75.75 0 01.75-.75z","clip-rule":"evenodd"})])}function Z(e,n){return i(),c("svg",{xmlns:"http://www.w3.org/2000/svg",viewBox:"0 0 24 24",fill:"currentColor","aria-hidden":"true"},[d("path",{"fill-rule":"evenodd",d:"M11.47 2.47a.75.75 0 011.06 0l7.5 7.5a.75.75 0 11-1.06 1.06l-6.22-6.22V21a.75.75 0 01-1.5 0V4.81l-6.22 6.22a.75.75 0 11-1.06-1.06l7.5-7.5z","clip-rule":"evenodd"})])}function B(e,n){return i(),c("svg",{xmlns:"http://www.w3.org/2000/svg",viewBox:"0 0 24 24",fill:"currentColor","aria-hidden":"true"},[d("path",{"fill-rule":"evenodd",d:"M3.75 12a.75.75 0 01.75-.75h15a.75.75 0 010 1.5h-15a.75.75 0 01-.75-.75z","clip-rule":"evenodd"})])}function H(e,n){return i(),c("svg",{xmlns:"http://www.w3.org/2000/svg",viewBox:"0 0 24 24",fill:"currentColor","aria-hidden":"true"},[d("path",{"fill-rule":"evenodd",d:"M12 3.75a.75.75 0 01.75.75v6.75h6.75a.75.75 0 010 1.5h-6.75v6.75a.75.75 0 01-1.5 0v-6.75H4.5a.75.75 0 010-1.5h6.75V4.5a.75.75 0 01.75-.75z","clip-rule":"evenodd"})])}var X={class:"flex flex-wrap"},O={class:"flex items-center"},q=["onClick"],N=["onClick"],W=["onClick"],K=["onClick"],Q={class:"ml-3 text-gray-500"},G={__name:"TimePicker",props:{modelValue:{type:Array,required:!0}},emits:["update:modelValue"],setup:function(e,n){var l=n.emit,t=e,a=f(t.modelValue?t.modelValue:[{value:"1",unit:"d",second:86400}]);s(a,(function(e){l("update:modelValue",e)}));return function(e,n){var l=u,t=o,f=r;return i(),c("div",X,[(i(!0),c(p,null,m(a.value,(function(e,n){return i(),c("div",{key:n,class:"mb-4 w-full"},[d("div",O,[v(l,{modelValue:e.value,"onUpdate:modelValue":function(n){return e.value=n},min:1,max:b(C)(e.unit),disabled:"forever"===e.unit},null,8,["modelValue","onUpdate:modelValue","max","disabled"]),v(f,{modelValue:e.unit,"onUpdate:modelValue":function(n){return e.unit=n},"fit-input-width":"",class:"ml-3 w-20"},{default:g((function(){return[(i(!0),c(p,null,m(b(L),(function(e){return i(),y(t,{key:e.value,label:e.label,value:e.value},null,8,["label","value"])})),128))]})),_:2},1032,["modelValue","onUpdate:modelValue"]),h(d("button",{type:"button",onClick:function(e){return function(e){if(0!==e){var n=a.value[e];a.value.splice(e,1),a.value.splice(e-1,0,n)}}(n)},class:"ml-2 py-2 px-2 rounded-md bg-blue-500 text-white hover:bg-blue-600 focus:bg-blue-700 focus:outline-none font-bold"},[v(b(Z),{class:"h-4"})],8,q),[[V,0!==n]]),h(d("button",{type:"button",onClick:function(e){return function(e){if(e!==a.value.length-1){var n=a.value[e];a.value.splice(e,1),a.value.splice(e+1,0,n)}}(n)},class:"ml-2 py-2 px-2 rounded-md bg-blue-500 text-white hover:bg-blue-600 focus:bg-blue-700 focus:outline-none font-bold"},[v(b(S),{class:"h-4"})],8,N),[[V,n!==a.value.length-1]]),h(d("button",{type:"button",onClick:function(e){return function(e){a.value.splice(e,0,{value:"",unit:"s"})}(n+1)},class:"ml-2 py-2 px-2 rounded-md bg-blue-500 text-white hover:bg-blue-600 focus:bg-blue-700 focus:outline-none font-bold"},[v(b(H),{class:"h-4"})],8,W),[[V,n===a.value.length-1]]),h(d("button",{type:"button",onClick:function(e){return function(e){a.value.splice(e,1)}(n)},class:"ml-2 py-2 px-2 rounded-md bg-red-500 text-white hover:bg-red-600 focus:bg-red-700 focus:outline-none font-bold"},[v(b(B),{class:"h-4"})],8,K),[[V,a.value.length>1]])]),d("small",Q,x(e.formatted),1)])})),128))])}}},J=function(e){return j("data-v-4c538bb3"),e=e(),P(),e},Y={class:"zfile-admin-down-link-body"},$={class:"text-red-400 font-bold"},ee=J((function(){return d("ul",null,[d("li",null,[w("限制泛域名 "),d("span",{class:"text-red-400"},"http 协议"),w(" 全部子目录可访问："),d("div",{class:"inline select-all font-bold"},[d("span",{class:"text-red-400"},"http://"),w("*example.com/**")])]),d("li",null,[w("限制泛域名 "),d("span",{class:"text-red-400"},"https 协议"),w(" 全部子目录可访问："),d("div",{class:"inline select-all font-bold"},[d("span",{class:"text-red-400"},"https://"),w("*example.com/**")])]),d("li",null,[w("限制泛域名 "),d("span",{class:"text-red-400"},"全部协议"),w(" 全部子目录可访问："),d("div",{class:"inline select-all font-bold"},[d("span",{class:"text-red-400"},"*://"),w("*example.com/**")])])],-1)})),ne={key:0},le={key:1},te={class:"mt-4"},ue=J((function(){return d("div",null,"可在下方输入你要测试的地址（应包含协议，路径，从浏览器地址栏复制就是了）",-1)})),ae=J((function(){return d("span",null,"单 IP",-1)})),oe=J((function(){return d("span",null,"秒内允许下载",-1)})),re=J((function(){return d("span",null,"次",-1)})),ie=J((function(){return d("span",null,"设置直链防止恶意下载，单 IP N 秒内只允许访问 M 次直链，如其中一个为 0 则不做任何限制.",-1)})),ce=J((function(){return d("br",null,null,-1)})),de=J((function(){return d("br",null,null,-1)})),fe=J((function(){return d("span",null,"注意：此功能对直链、短链都有效，且共享限制次数。但直链/短链跳转后的实际下载链接无法限制，因为那些链接不经过 ZFile.",-1)})),se=J((function(){return d("br",null,null,-1)})),pe=J((function(){return d("br",null,null,-1)})),me={class:"text-blue-400"},ve={class:"dialog-footer"};e("default",E({__name:"basic-setting",setup:function(e){var o=U(),r=o.data,s=o.saveData,p=o.saveLoading,m=f("");I().then((function(e){m.value=e.data.data}));var j=f(""),P=f(null),C=A((function(){var e,n={antPath:null==r||null===(e=r.value)||void 0===e?void 0:e.refererValue,testPath:j.value};z(n).then((function(e){P.value=e.data.data}))}),250);return function(e,o){var f=T,L=l,U=R,I=G,z=a,E=u,A=n,S=t,Z=M;return i(),c("div",Y,[b(r)?h((i(),y(S,{key:0,model:b(r),"element-loading-text":"保存中..."},{"form-title":g((function(){return[w(" 直/短链设置 ")]})),"form-sub-title":g((function(){return[w(" 这里可以配置直/短链相关设置 ")]})),footer:g((function(){return[d("span",ve,[v(A,{type:"primary",onClick:b(s)},{default:g((function(){return[w("保存")]})),_:1},8,["onClick"])])]})),default:g((function(){return[v(L,{label:"记录下载日志"},{tips:g((function(){return[w(" 是否记录直/短链下载日志 ")]})),default:g((function(){return[v(f,{modelValue:b(r).recordDownloadLog,"onUpdate:modelValue":o[0]||(o[0]=function(e){return b(r).recordDownloadLog=e})},null,8,["modelValue"])]})),_:1}),v(L,{label:"是否允许生成/使用直链（路径）"},{tips:g((function(){return[w(" 控制是否生成直链时显示直链路径及是否允许使用直链进行下载. ")]})),default:g((function(){return[v(f,{modelValue:b(r).showPathLink,"onUpdate:modelValue":o[1]||(o[1]=function(e){return b(r).showPathLink=e})},null,8,["modelValue"])]})),_:1}),v(L,{label:"直链地址前缀"},{tips:g((function(){return[w(" 直链地址前缀, 如 http(s)://ip:port/"),d("span",$,x(b(r).directLinkPrefix),1),w("/path/filename ")]})),default:g((function(){return[v(U,{modelValue:b(r).directLinkPrefix,"onUpdate:modelValue":o[2]||(o[2]=function(e){return b(r).directLinkPrefix=e})},null,8,["modelValue"])]})),_:1}),v(L,{label:"是否允许使用短链"},{tips:g((function(){return[w(" 控制是否生成直链时显示短链路径及是否允许使用短链进行下载 ")]})),default:g((function(){return[v(f,{modelValue:b(r).showShortLink,"onUpdate:modelValue":o[3]||(o[3]=function(e){return b(r).showShortLink=e})},null,8,["modelValue"])]})),_:1}),v(L,{label:"短链有效期"},{tips:g((function(){return[w(" 控制生成短链的有效期 ")]})),default:g((function(){return[v(I,{modelValue:b(r).linkExpireTimes,"onUpdate:modelValue":o[4]||(o[4]=function(e){return b(r).linkExpireTimes=e})},null,8,["modelValue"])]})),_:1}),v(L,{label:"Referer 防盗链"},{tips:g((function(){return[w(" 防盗链支持访问文件直链或短链时校验，如用户直接访问直链跳转后的存储源原始链接，无法进行校验和拦截。 ")]})),default:g((function(){return[v(z,{modelValue:b(r).refererType,"onUpdate:modelValue":o[5]||(o[5]=function(e){return b(r).refererType=e}),label:"off"},{default:g((function(){return[w("不启用 Referer 防盗链")]})),_:1},8,["modelValue"]),v(z,{modelValue:b(r).refererType,"onUpdate:modelValue":o[6]||(o[6]=function(e){return b(r).refererType=e}),label:"white_list"},{default:g((function(){return[w("启用白名单")]})),_:1},8,["modelValue"]),v(z,{modelValue:b(r).refererType,"onUpdate:modelValue":o[7]||(o[7]=function(e){return b(r).refererType=e}),label:"black_list"},{default:g((function(){return[w("启用黑名单")]})),_:1},8,["modelValue"])]})),_:1}),h(v(L,{label:"Referer 配置"},{default:g((function(){return[v(z,{modelValue:b(r).refererAllowEmpty,"onUpdate:modelValue":o[8]||(o[8]=function(e){return b(r).refererAllowEmpty=e}),label:!0},{default:g((function(){return[w("允许 Referer 为空")]})),_:1},8,["modelValue"]),v(z,{modelValue:b(r).refererAllowEmpty,"onUpdate:modelValue":o[9]||(o[9]=function(e){return b(r).refererAllowEmpty=e}),label:!1},{default:g((function(){return[w("禁止 Referer 为空")]})),_:1},8,["modelValue"])]})),_:1},512),[[V,"no"!==b(r).refererType]]),h(v(L,{label:"白名单"},{tips:g((function(){return[w(" 每行输入一个域名，如： "),ee,"white_list"===b(r).refererType?(i(),c("div",ne," 每行输入一个域名，需要写协议头支持 * 通配符，如白名单 http://*zfile.vip 将只允许 http://zfile.vip、http://www.zfile.vip、http://demo.zfile.vip 等网站访问。 ")):k("",!0),"black_list"===b(r).refererType?(i(),c("div",le," 每行输入一个域名，需要写协议头，支持 * 通配符，如黑名单 http://*zfile.vip 将禁止所有如 http://zfile.vip、http://www.zfile.vip、http://demo.zfile.vip 等网站访问。 ")):k("",!0),d("div",te,[ue,v(U,{onInput:b(C),modelValue:b(j),"onUpdate:modelValue":o[11]||(o[11]=function(e){return _(j)?j.value=e:null})},{suffix:g((function(){return[b(j)&&!0===b(P)?(i(),y(b(F),{key:0,class:"w-4 text-green-500"})):b(j)&&!1===b(P)?(i(),y(b(D),{key:1,class:"w-4 text-red-500"})):k("",!0)]})),_:1},8,["onInput","modelValue"])])]})),default:g((function(){return[v(U,{type:"textarea",onInput:b(C),rows:6,modelValue:b(r).refererValue,"onUpdate:modelValue":o[10]||(o[10]=function(e){return b(r).refererValue=e})},null,8,["onInput","modelValue"])]})),_:1},512),[[V,"no"!==b(r).refererType]]),v(L,{label:"直链下载限制"},{tips:g((function(){return[ie,ce,de,fe,se,pe,d("span",null,[w('注意：如果你使用了反向代理，而不是直接访问的 ZFile 端口, 那你需要在反向代理处设置以下请求头为用户真实 IP："X-Forwarded-For", "X-Real-IP", "Proxy-Client-IP", "WL-Proxy-Client-IP", "HTTP_CLIENT_IP", "HTTP_X_FORWARDED_FOR"，不然不论谁访问 ZFile 都只能获取到反代服务器的 IP，同服务器一般是获取到 127.0.0.1 或 localhost, 这样此功能就无法正常使用!!! (辅助信息: 系统获取到您当前 IP 为 '),d("span",me,x(b(m)),1),w(")")])]})),default:g((function(){return[ae,v(E,{modelValue:b(r).linkLimitSecond,"onUpdate:modelValue":o[12]||(o[12]=function(e){return b(r).linkLimitSecond=e}),min:0,max:86400,step:1,size:"small",class:"mx-2"},null,8,["modelValue"]),oe,v(E,{modelValue:b(r).linkDownloadLimit,"onUpdate:modelValue":o[13]||(o[13]=function(e){return b(r).linkDownloadLimit=e}),min:0,max:9999999,step:1,size:"small",class:"mx-2"},null,8,["modelValue"]),re]})),_:1})]})),_:1},8,["model"])),[[Z,b(p)]]):k("",!0)])}}},[["__scopeId","data-v-4c538bb3"]]))}}}))}();

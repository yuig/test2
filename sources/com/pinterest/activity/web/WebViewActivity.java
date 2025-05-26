package com.pinterest.activity.web;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.pinterest.activity.web.WebViewActivity;
import cs1.c;
import g92.g;
import h32.a4;
import h32.d4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lu1.b;
import me.o;
import pr.a;

/* loaded from: classes.dex */
public class WebViewActivity extends a {

    /* renamed from: b, reason: collision with root package name */
    public so1.a f35238b;

    /* renamed from: c, reason: collision with root package name */
    public g f35239c;

    /* renamed from: d, reason: collision with root package name */
    public b f35240d;

    @Override // cp1.p, uo1.a
    public final so1.a getBaseActivityComponent() {
        return this.f35238b;
    }

    @Override // cp1.p
    public final Fragment getFragment() {
        return null;
    }

    @Override // cp1.p, uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getI0() {
        return a4.BROWSER;
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getH0() {
        return d4.BROWSER;
    }

    @Override // cp1.p, cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        inject();
        this.f35239c.b(this);
        super.onCreate(bundle);
        setContentView(c.activity_webview_mvp);
        WebAuthenticateHeader webAuthenticateHeader = (WebAuthenticateHeader) findViewById(cs1.b.authenticate_header);
        final int i13 = 0;
        if (!getIntent().getBooleanExtra("com.pinterest.EXTRA_IS_PRELOAD_EXPERIENCE", false)) {
            webAuthenticateHeader.setVisibility(8);
            return;
        }
        webAuthenticateHeader.setVisibility(0);
        Function0 function0 = new Function0(this) { // from class: pr.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebViewActivity f101155b;

            {
                this.f101155b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i14 = i13;
                WebViewActivity webViewActivity = this.f101155b;
                switch (i14) {
                    case 0:
                        ((lu1.c) webViewActivity.f35240d).p(webViewActivity);
                        break;
                    default:
                        ((lu1.c) webViewActivity.f35240d).p(webViewActivity);
                        break;
                }
                return Unit.f80348a;
            }
        };
        final int i14 = 1;
        webAuthenticateHeader.L(function0, new Function0(this) { // from class: pr.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebViewActivity f101155b;

            {
                this.f101155b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i142 = i14;
                WebViewActivity webViewActivity = this.f101155b;
                switch (i142) {
                    case 0:
                        ((lu1.c) webViewActivity.f35240d).p(webViewActivity);
                        break;
                    default:
                        ((lu1.c) webViewActivity.f35240d).p(webViewActivity);
                        break;
                }
                return Unit.f80348a;
            }
        });
    }

    @Override // cp1.p
    public final void setupActivityComponent() {
        if (this.f35238b == null) {
            this.f35238b = (so1.a) o.a(this, so1.a.class);
        }
    }
}

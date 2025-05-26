package ch;

import ai.m;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.n;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import gi.b2;
import jh.o;

/* loaded from: classes3.dex */
public final class c extends j1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27715i;

    public c(int i13) {
        this.f27715i = i13;
    }

    @Override // df.j1
    public final com.google.android.gms.common.api.c s(Context context, Looper looper, jh.g gVar, com.google.android.gms.common.api.b bVar, com.google.android.gms.common.api.g gVar2, com.google.android.gms.common.api.h hVar) {
        switch (this.f27715i) {
            case 0:
                return new zh.c(context, looper, gVar, (j) bVar, gVar2, hVar);
            case 1:
                return new zh.c(context, looper, gVar, (j) bVar, gVar2, hVar);
            case 2:
                return new m(context, looper, gVar, (bh.c) bVar, gVar2, hVar);
            case 3:
                return new fh.e(context, looper, gVar, (GoogleSignInOptions) bVar, gVar2, hVar);
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                return t(context, looper, gVar, bVar, gVar2, hVar);
            case 8:
                return new b2(context, looper, RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE, gVar, gVar2, hVar);
            case 9:
                return new hi.i(context, looper, gVar2, hVar, gVar);
            case 10:
                Integer num = gVar.f76151h;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", gVar.f76144a);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new si.a(context, looper, gVar, bundle, gVar2, hVar);
            case 11:
                a.c.q(bVar);
                throw null;
        }
    }

    @Override // df.j1
    public final jh.h t(Context context, Looper looper, jh.g gVar, com.google.android.gms.common.api.b bVar, com.google.android.gms.common.api.internal.e eVar, n nVar) {
        switch (this.f27715i) {
            case 4:
                a.c.q(bVar);
                return new m(context, looper, gVar, eVar, nVar);
            case 5:
                return new kh.c(context, looper, gVar, (o) bVar, eVar, nVar);
            case 6:
                return new ai.o(context, looper, gVar, eVar, nVar);
            default:
                throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }
}

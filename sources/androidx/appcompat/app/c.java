package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.media3.ui.TrackSelectionView;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.login.LoginClient;
import com.facebook.login.widget.LoginButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.pinterest.api.model.vh;
import com.pinterest.ui.brio.reps.pinner.PinnerGridCell;
import h32.f1;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15958b;

    public /* synthetic */ c(Object obj, int i13) {
        this.f15957a = i13;
        this.f15958b = obj;
    }

    public com.facebook.login.x a() {
        com.facebook.login.c0 targetApp;
        Object obj = this.f15958b;
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            com.facebook.login.x w13 = com.facebook.login.x.f30074j.w();
            com.facebook.login.c defaultAudience = ((LoginButton) obj).f30053l.f87068a;
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            w13.f30079b = defaultAudience;
            com.facebook.login.j loginBehavior = ((LoginButton) obj).f30053l.f87070c;
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            w13.f30078a = loginBehavior;
            if (!p001if.a.b(this)) {
                try {
                    targetApp = com.facebook.login.c0.FACEBOOK;
                } catch (Throwable th3) {
                    p001if.a.a(this, th3);
                }
                Intrinsics.checkNotNullParameter(targetApp, "targetApp");
                w13.f30084g = targetApp;
                String authType = ((LoginButton) obj).f30053l.f87071d;
                Intrinsics.checkNotNullParameter(authType, "authType");
                w13.f30081d = authType;
                p001if.a.b(this);
                w13.f30085h = false;
                ((LoginButton) obj).f30053l.getClass();
                w13.f30086i = false;
                ((LoginButton) obj).f30053l.getClass();
                w13.f30082e = null;
                ((LoginButton) obj).f30053l.getClass();
                w13.f30083f = false;
                return w13;
            }
            targetApp = null;
            Intrinsics.checkNotNullParameter(targetApp, "targetApp");
            w13.f30084g = targetApp;
            String authType2 = ((LoginButton) obj).f30053l.f87071d;
            Intrinsics.checkNotNullParameter(authType2, "authType");
            w13.f30081d = authType2;
            p001if.a.b(this);
            w13.f30085h = false;
            ((LoginButton) obj).f30053l.getClass();
            w13.f30086i = false;
            ((LoginButton) obj).f30053l.getClass();
            w13.f30082e = null;
            ((LoginButton) obj).f30053l.getClass();
            w13.f30083f = false;
            return w13;
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
            return null;
        }
    }

    public final void b() {
        Object obj = this.f15958b;
        if (p001if.a.b(this)) {
            return;
        }
        try {
            com.facebook.login.x a13 = a();
            if (((LoginButton) obj).f30065x != null) {
                ((LoginButton) obj).getClass();
                ((com.facebook.login.v) ((LoginButton) obj).f30065x.f63165c).f30044a = new df.j();
                ((LoginButton) obj).f30065x.a(((LoginButton) obj).f30053l.f87069b);
                return;
            }
            LoginButton loginButton = (LoginButton) obj;
            loginButton.getClass();
            p001if.a.b(loginButton);
            LoginButton loginButton2 = (LoginButton) obj;
            loginButton2.getClass();
            p001if.a.b(loginButton2);
            Activity activity = ((LoginButton) obj).b();
            List list = ((LoginButton) obj).f30053l.f87069b;
            String str = ((LoginButton) obj).f30064w;
            a13.getClass();
            Intrinsics.checkNotNullParameter(activity, "activity");
            LoginClient.Request a14 = a13.a(new com.facebook.login.n(list));
            if (str != null) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                a14.f29970e = str;
            }
            a13.g(new com.facebook.login.u(activity), a14);
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final void c(Context context) {
        String str;
        Object obj = this.f15958b;
        if (p001if.a.b(this)) {
            return;
        }
        try {
            com.facebook.login.x a13 = a();
            if (!((LoginButton) obj).f30050i) {
                a13.d();
                return;
            }
            String string = ((LoginButton) obj).getResources().getString(com.facebook.login.h0.com_facebook_loginview_log_out_action);
            String string2 = ((LoginButton) obj).getResources().getString(com.facebook.login.h0.com_facebook_loginview_cancel_action);
            String str2 = Profile.f29917h;
            Profile p13 = com.bugsnag.android.a0.p();
            String string3 = (p13 == null || (str = p13.f29922e) == null) ? ((LoginButton) obj).getResources().getString(com.facebook.login.h0.com_facebook_loginview_logged_in_using_facebook) : String.format(((LoginButton) obj).getResources().getString(com.facebook.login.h0.com_facebook_loginview_logged_in_as), str);
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(string3).setCancelable(true).setPositiveButton(string, new mf.e(a13)).setNegativeButton(string2, (DialogInterface.OnClickListener) null);
            builder.create().show();
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        rg0.n nVar;
        int i13 = this.f15957a;
        Message message4 = null;
        boolean z13 = false;
        int i14 = 0;
        z13 = false;
        boolean z14 = true;
        Object obj = this.f15958b;
        switch (i13) {
            case 0:
                kg.n.a(view);
                i iVar = (i) obj;
                if (view == iVar.f16035j && (message3 = iVar.f16037l) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == iVar.f16039n && (message2 = iVar.f16041p) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == iVar.f16043r && (message = iVar.f16045t) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                iVar.f16025J.obtainMessage(1, iVar.f16027b).sendToTarget();
                return;
            case 1:
                kg.n.a(view);
                TrackSelectionView trackSelectionView = (TrackSelectionView) obj;
                int i15 = TrackSelectionView.f19007e;
                trackSelectionView.getClass();
                kg.n.a(view);
                HashMap hashMap = trackSelectionView.f19010c;
                CheckedTextView checkedTextView = trackSelectionView.f19009b;
                CheckedTextView checkedTextView2 = trackSelectionView.f19008a;
                if (view == checkedTextView2) {
                    trackSelectionView.f19011d = true;
                    hashMap.clear();
                } else {
                    if (view != checkedTextView) {
                        trackSelectionView.f19011d = false;
                        Object tag = view.getTag();
                        tag.getClass();
                        a.c.t(tag);
                        throw null;
                    }
                    trackSelectionView.f19011d = false;
                    hashMap.clear();
                }
                checkedTextView2.setChecked(trackSelectionView.f19011d);
                if (!trackSelectionView.f19011d && hashMap.size() == 0) {
                    z13 = true;
                }
                checkedTextView.setChecked(z13);
                throw null;
            case 2:
                kg.n.a(view);
                if (p001if.a.b(this)) {
                    return;
                }
                try {
                    LoginButton loginButton = (LoginButton) obj;
                    int i16 = LoginButton.f30049y;
                    loginButton.getClass();
                    if (!p001if.a.b(loginButton)) {
                        try {
                            View.OnClickListener onClickListener = loginButton.f83093c;
                            if (onClickListener != null) {
                                onClickListener.onClick(view);
                            }
                        } catch (Throwable th3) {
                            p001if.a.a(loginButton, th3);
                        }
                    }
                    Date date = AccessToken.f29844l;
                    AccessToken s13 = wc.j.s();
                    if (wc.j.z()) {
                        c(((LoginButton) obj).getContext());
                    } else {
                        b();
                    }
                    me.r rVar = new me.r(((LoginButton) obj).getContext());
                    Bundle bundle = new Bundle();
                    if (s13 == null) {
                        i14 = 1;
                    }
                    bundle.putInt("logging_in", i14);
                    bundle.putInt("access_token_expired", wc.j.z() ? 1 : 0);
                    rVar.c(((LoginButton) obj).f30054m, bundle);
                    return;
                } catch (Throwable th4) {
                    p001if.a.a(this, th4);
                    return;
                }
            case 3:
                kg.n.a(view);
                if (p001if.a.b(this)) {
                    return;
                }
                try {
                    ((mf.k) obj).b();
                    return;
                } catch (Throwable th5) {
                    p001if.a.a(this, th5);
                    return;
                }
            case 4:
                kg.n.a(view);
                kj.h hVar = (kj.h) obj;
                if (hVar.f79839j && hVar.isShowing()) {
                    if (!hVar.f79841l) {
                        TypedArray obtainStyledAttributes = hVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        hVar.f79840k = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        hVar.f79841l = true;
                    }
                    if (hVar.f79840k) {
                        hVar.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                kg.n.a(view);
                com.google.android.material.datepicker.s sVar = (com.google.android.material.datepicker.s) obj;
                com.google.android.material.datepicker.q qVar = sVar.f32562g;
                com.google.android.material.datepicker.q qVar2 = com.google.android.material.datepicker.q.YEAR;
                if (qVar == qVar2) {
                    sVar.O6(com.google.android.material.datepicker.q.DAY);
                    return;
                } else {
                    if (qVar == com.google.android.material.datepicker.q.DAY) {
                        sVar.O6(qVar2);
                        return;
                    }
                    return;
                }
            case 6:
                kg.n.a(view);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                com.google.android.material.internal.t tVar = (com.google.android.material.internal.t) obj;
                com.google.android.material.internal.l lVar = tVar.f32781e;
                if (lVar != null) {
                    lVar.f32770f = true;
                }
                n.q qVar3 = navigationMenuItemView.B;
                boolean r13 = tVar.f32779c.r(qVar3, tVar, 0);
                if (qVar3 != null && qVar3.isCheckable() && r13) {
                    tVar.f32781e.D(qVar3);
                } else {
                    z14 = false;
                }
                com.google.android.material.internal.l lVar2 = tVar.f32781e;
                if (lVar2 != null) {
                    lVar2.f32770f = false;
                }
                if (z14) {
                    tVar.h(false);
                    return;
                }
                return;
            case 7:
                kg.n.a(view);
                n.q qVar4 = ((com.google.android.material.navigation.f) view).f32869s;
                com.google.android.material.navigation.h hVar2 = (com.google.android.material.navigation.h) obj;
                if (hVar2.D.r(qVar4, hVar2.C, 0)) {
                    return;
                }
                qVar4.setChecked(true);
                return;
            case 8:
                kg.n.a(view);
                cr.h hVar3 = (cr.h) obj;
                vh vhVar = hVar3.f53081b;
                if (vhVar != null && (nVar = hVar3.f53082c) != null && !vhVar.f42867y) {
                    vhVar.f42867y = true;
                    nVar.a(vhVar.f42862t, null);
                }
                hVar3.f53080a.h0(f1.TAP, hVar3.f53083d, h32.g0.DYNAMIC_GRID_STORY, "", hVar3.a(), null, null, false);
                return;
            default:
                kg.n.a(view);
                PinnerGridCell pinnerGridCell = (PinnerGridCell) obj;
                if (pinnerGridCell.f52215d == null) {
                    return;
                }
                sh.f.a().b0(h32.u0.USER_LIST_USER, h32.g0.USER_FEED, pinnerGridCell.f52215d.a(), false);
                r41.k.f106176a.d(pinnerGridCell.f52215d.a(), r41.b.PinnerGridCell);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TrackSelectionView trackSelectionView) {
        this(trackSelectionView, 1);
        this.f15957a = 1;
    }
}

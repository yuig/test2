package kb1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.m1;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import com.pinterest.settings.SettingsRoundHeaderView;
import df.j1;
import ea1.t0;
import ea1.u0;
import h32.a4;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.text.StringsKt;
import kotlin.text.z;
import pk.a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkb1/n;", "Lnl1/d;", "<init>", "()V", "passcode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class n extends a {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f79083j0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final d4 f79084c0 = d4.PARENTAL_PASSCODE;

    /* renamed from: d0, reason: collision with root package name */
    public final a4 f79085d0 = a4.PARENTAL_PASSCODE_BACKUP_EMAIL;

    /* renamed from: e0, reason: collision with root package name */
    public final m1 f79086e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltTextField f79087f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltTextField f79088g0;

    /* renamed from: h0, reason: collision with root package name */
    public GestaltButton f79089h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f79090i0;

    public n() {
        int i13 = 5;
        xk2.k r13 = d7.g.r(9, new t0(this, i13), xk2.n.NONE);
        int i14 = 6;
        this.f79086e0 = a1.s(this, k0.f80436a.b(u.class), new u0(r13, i13), new ca1.m(r13, i14), new ca1.n(this, r13, i14));
    }

    public static boolean a8(String str) {
        return (z.j(str) ^ true) && tr1.b.c(str);
    }

    @Override // nl1.d
    public final void K7() {
        Window window;
        super.K7();
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        this.f79090i0 = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
    }

    @Override // nl1.d
    public final void L7() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            Window window = E4.getWindow();
            if (window != null) {
                window.setSoftInputMode(this.f79090i0);
            }
            hf0.b.l(E4);
        }
        super.L7();
    }

    public final void Y7(gm1.c cVar) {
        GestaltTextField gestaltTextField = this.f79087f0;
        if (gestaltTextField == null) {
            Intrinsics.r("backupEmailTextField");
            throw null;
        }
        String obj = StringsKt.i0(gestaltTextField.B0()).toString();
        GestaltTextField gestaltTextField2 = this.f79088g0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("confirmBackupEmailTextField");
            throw null;
        }
        String obj2 = StringsKt.i0(gestaltTextField2.B0()).toString();
        if (!(cVar instanceof xn1.a)) {
            if (cVar instanceof xn1.f) {
                int j13 = cVar.j();
                if (j13 == f52.a.backup_email_text_field) {
                    if (((xn1.f) cVar).f135448c) {
                        return;
                    }
                    GestaltTextField gestaltTextField3 = this.f79087f0;
                    if (gestaltTextField3 != null) {
                        gestaltTextField3.X(new d91.l(obj, 9));
                        return;
                    } else {
                        Intrinsics.r("backupEmailTextField");
                        throw null;
                    }
                }
                if (j13 != f52.a.confirm_backup_email_text_field || ((xn1.f) cVar).f135448c) {
                    return;
                }
                GestaltTextField gestaltTextField4 = this.f79088g0;
                if (gestaltTextField4 != null) {
                    gestaltTextField4.X(new d91.l(obj2, 10));
                    return;
                } else {
                    Intrinsics.r("confirmBackupEmailTextField");
                    throw null;
                }
            }
            return;
        }
        int j14 = cVar.j();
        if (j14 == f52.a.backup_email_text_field) {
            GestaltTextField gestaltTextField5 = this.f79087f0;
            if (gestaltTextField5 == null) {
                Intrinsics.r("backupEmailTextField");
                throw null;
            }
            GestaltTextField gestaltTextField6 = this.f79088g0;
            if (gestaltTextField6 == null) {
                Intrinsics.r("confirmBackupEmailTextField");
                throw null;
            }
            b8(gestaltTextField5, gestaltTextField6, true);
        } else if (j14 == f52.a.confirm_backup_email_text_field) {
            GestaltTextField gestaltTextField7 = this.f79088g0;
            if (gestaltTextField7 == null) {
                Intrinsics.r("confirmBackupEmailTextField");
                throw null;
            }
            GestaltTextField gestaltTextField8 = this.f79087f0;
            if (gestaltTextField8 == null) {
                Intrinsics.r("backupEmailTextField");
                throw null;
            }
            b8(gestaltTextField7, gestaltTextField8, false);
        }
        GestaltButton gestaltButton = this.f79089h0;
        if (gestaltButton == null) {
            Intrinsics.r("sendEmailButton");
            throw null;
        }
        gestaltButton.d(new rx0.f(this, obj, obj2, 25));
        GestaltButton gestaltButton2 = this.f79089h0;
        if (gestaltButton2 == null) {
            Intrinsics.r("sendEmailButton");
            throw null;
        }
        if (gestaltButton2.isEnabled()) {
            GestaltTextField gestaltTextField9 = this.f79087f0;
            if (gestaltTextField9 == null) {
                Intrinsics.r("backupEmailTextField");
                throw null;
            }
            m mVar = m.f79082i;
            gestaltTextField9.X(mVar);
            GestaltTextField gestaltTextField10 = this.f79088g0;
            if (gestaltTextField10 != null) {
                gestaltTextField10.X(mVar);
            } else {
                Intrinsics.r("confirmBackupEmailTextField");
                throw null;
            }
        }
    }

    public final boolean Z7(String str) {
        if (j1.U0(str)) {
            wy0 f13 = ((b60.d) getActiveUserManager()).f();
            if (Intrinsics.d(str, f13 != null ? f13.N2() : null)) {
                return true;
            }
        }
        return false;
    }

    public final void b8(GestaltTextField gestaltTextField, GestaltTextField gestaltTextField2, boolean z13) {
        u50.k0 k0Var;
        String obj = StringsKt.i0(gestaltTextField.B0()).toString();
        String obj2 = StringsKt.i0(gestaltTextField2.B0()).toString();
        if (j1.U0(obj) && !a8(obj)) {
            k0Var = bs1.c.j2(new String[0], f52.c.error_enter_in_valid_email);
        } else if (j1.U0(obj) && j1.U0(obj2) && !Intrinsics.d(obj, obj2)) {
            k0Var = bs1.c.j2(new String[0], f52.c.error_emails_do_not_match);
        } else if (z13 && Z7(obj)) {
            k0Var = bs1.c.j2(new String[0], f52.c.error_email_already_used);
        } else {
            k0Var = null;
        }
        if (k0Var == null || gestaltTextField.X(new uv.b(k0Var, 7)) == null) {
            gestaltTextField.X(m.f79082i);
            Unit unit = Unit.f80348a;
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getQ0() {
        return this.f79085d0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getP0() {
        return this.f79084c0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String v03;
        super.onCreate(bundle);
        this.E = f52.b.fragment_passcode_setup_email;
        Navigation navigation = this.I;
        if (navigation == null || (v03 = navigation.v0("PASSCODE_CONFIRMED_CODE_EXTRA")) == null) {
            return;
        }
        kh2.j.x2((u) this.f79086e0.getValue(), new c(v03));
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view);
        settingsRoundHeaderView.k0(f52.c.settings_parental_passcode_create_email_title);
        settingsRoundHeaderView.g0(new x91.k(this, 13));
        View findViewById = onCreateView.findViewById(f52.a.text_current_step);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        a0.q((GestaltText) findViewById, bs1.c.j2(new String[]{"2", "2"}, f52.c.settings_parental_passcode_create_step));
        View findViewById2 = onCreateView.findViewById(f52.a.backup_email_text_field);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById2;
        this.f79087f0 = gestaltTextField;
        if (gestaltTextField == null) {
            Intrinsics.r("backupEmailTextField");
            throw null;
        }
        final int i13 = 0;
        gestaltTextField.Z(new gm1.a(this) { // from class: kb1.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f79073b;

            {
                this.f79073b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                n this$0 = this.f79073b;
                switch (i14) {
                    case 0:
                        int i15 = n.f79083j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.Y7(it);
                        return;
                    case 1:
                        int i16 = n.f79083j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.Y7(it);
                        return;
                    default:
                        int i17 = n.f79083j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        u uVar = (u) this$0.f79086e0.getValue();
                        GestaltTextField gestaltTextField2 = this$0.f79087f0;
                        if (gestaltTextField2 == null) {
                            Intrinsics.r("backupEmailTextField");
                            throw null;
                        }
                        String B0 = gestaltTextField2.B0();
                        GestaltTextField gestaltTextField3 = this$0.f79088g0;
                        if (gestaltTextField3 != null) {
                            kh2.j.x2(uVar, new d(B0, gestaltTextField3.B0()));
                            return;
                        } else {
                            Intrinsics.r("confirmBackupEmailTextField");
                            throw null;
                        }
                }
            }
        });
        View findViewById3 = onCreateView.findViewById(f52.a.confirm_backup_email_text_field);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltTextField gestaltTextField2 = (GestaltTextField) findViewById3;
        this.f79088g0 = gestaltTextField2;
        if (gestaltTextField2 == null) {
            Intrinsics.r("confirmBackupEmailTextField");
            throw null;
        }
        final int i14 = 1;
        gestaltTextField2.Z(new gm1.a(this) { // from class: kb1.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f79073b;

            {
                this.f79073b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                n this$0 = this.f79073b;
                switch (i142) {
                    case 0:
                        int i15 = n.f79083j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.Y7(it);
                        return;
                    case 1:
                        int i16 = n.f79083j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.Y7(it);
                        return;
                    default:
                        int i17 = n.f79083j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        u uVar = (u) this$0.f79086e0.getValue();
                        GestaltTextField gestaltTextField22 = this$0.f79087f0;
                        if (gestaltTextField22 == null) {
                            Intrinsics.r("backupEmailTextField");
                            throw null;
                        }
                        String B0 = gestaltTextField22.B0();
                        GestaltTextField gestaltTextField3 = this$0.f79088g0;
                        if (gestaltTextField3 != null) {
                            kh2.j.x2(uVar, new d(B0, gestaltTextField3.B0()));
                            return;
                        } else {
                            Intrinsics.r("confirmBackupEmailTextField");
                            throw null;
                        }
                }
            }
        });
        final int i15 = 2;
        this.f79089h0 = ((GestaltButton) onCreateView.findViewById(f52.a.send_email_button)).e(new gm1.a(this) { // from class: kb1.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f79073b;

            {
                this.f79073b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i15;
                n this$0 = this.f79073b;
                switch (i142) {
                    case 0:
                        int i152 = n.f79083j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.Y7(it);
                        return;
                    case 1:
                        int i16 = n.f79083j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.Y7(it);
                        return;
                    default:
                        int i17 = n.f79083j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        u uVar = (u) this$0.f79086e0.getValue();
                        GestaltTextField gestaltTextField22 = this$0.f79087f0;
                        if (gestaltTextField22 == null) {
                            Intrinsics.r("backupEmailTextField");
                            throw null;
                        }
                        String B0 = gestaltTextField22.B0();
                        GestaltTextField gestaltTextField3 = this$0.f79088g0;
                        if (gestaltTextField3 != null) {
                            kh2.j.x2(uVar, new d(B0, gestaltTextField3.B0()));
                            return;
                        } else {
                            Intrinsics.r("confirmBackupEmailTextField");
                            throw null;
                        }
                }
            }
        });
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new l(this, null), 3);
    }
}

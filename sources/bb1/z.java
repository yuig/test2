package bb1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lbb1/z;", "Lyk1/k;", "Lya1/f;", "<init>", "()V", "security_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class z extends f implements ya1.f {

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f22580t0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f22581j0;

    /* renamed from: k0, reason: collision with root package name */
    public cr1.a f22582k0;

    /* renamed from: l0, reason: collision with root package name */
    public i92.k f22583l0;

    /* renamed from: m0, reason: collision with root package name */
    public ab1.q f22584m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltText f22585n0;

    /* renamed from: o0, reason: collision with root package name */
    public View f22586o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltText f22587p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltButton f22588q0;

    /* renamed from: r0, reason: collision with root package name */
    public final d4 f22589r0 = d4.MULTI_FACTOR_AUTH_BACKUP;

    /* renamed from: s0, reason: collision with root package name */
    public final a4 f22590s0 = a4.BACKUP_CODE;

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.P(qVar.drawableRes(requireContext, dl2.b.f1(requireContext2)), eo1.b.color_themed_text_default);
        gestaltToolbarImpl.b0(getString(l52.c.settings_mfa_backup_code_title));
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.f22581j0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar).f(s7(), "");
        uj2.q p73 = p7();
        cr1.a aVar = this.f22582k0;
        if (aVar != null) {
            return new ab1.q(f13, p73, aVar);
        }
        Intrinsics.r("accountService");
        throw null;
    }

    public final void b8(boolean z13) {
        if (z13) {
            f7().d(new of0.a(new mf0.l()));
        } else {
            ep.b.C(null, f7());
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF22517r0() {
        return this.f22590s0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF22516q0() {
        return this.f22589r0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = l52.b.fragment_mfa_backup_code;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(l52.a.mfa_backup_code_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f22585n0 = (GestaltText) findViewById;
        View findViewById2 = onCreateView.findViewById(l52.a.mfa_backup_code_copy_clipboard);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f22586o0 = findViewById2;
        View findViewById3 = onCreateView.findViewById(l52.a.mfa_backup_code_request_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f22587p0 = (GestaltText) findViewById3;
        View findViewById4 = onCreateView.findViewById(l52.a.mfa_backup_code_done_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f22588q0 = (GestaltButton) findViewById4;
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View view = this.f22586o0;
        if (view == null) {
            Intrinsics.r("backupCopyClipboardIcon");
            throw null;
        }
        view.setOnClickListener(new x91.k(this, 7));
        GestaltText gestaltText = this.f22587p0;
        if (gestaltText == null) {
            Intrinsics.r("requestNewCodeText");
            throw null;
        }
        final int i13 = 0;
        gestaltText.j(new gm1.a(this) { // from class: bb1.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f22579b;

            {
                this.f22579b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                z this$0 = this.f22579b;
                switch (i14) {
                    case 0:
                        int i15 = z.f22580t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEW_CODE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.q qVar = this$0.f22584m0;
                        if (qVar != null) {
                            qVar.s3();
                            break;
                        }
                        break;
                    default:
                        int i16 = z.f22580t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.DONE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        this$0.z(h.f22506s);
                        break;
                }
            }
        });
        GestaltButton gestaltButton = this.f22588q0;
        if (gestaltButton == null) {
            Intrinsics.r("doneButton");
            throw null;
        }
        final int i14 = 1;
        gestaltButton.d(h.f22505r).e(new gm1.a(this) { // from class: bb1.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f22579b;

            {
                this.f22579b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                z this$0 = this.f22579b;
                switch (i142) {
                    case 0:
                        int i15 = z.f22580t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEW_CODE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.q qVar = this$0.f22584m0;
                        if (qVar != null) {
                            qVar.s3();
                            break;
                        }
                        break;
                    default:
                        int i16 = z.f22580t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.DONE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        this$0.z(h.f22506s);
                        break;
                }
            }
        });
    }
}

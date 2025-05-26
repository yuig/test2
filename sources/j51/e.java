package j51;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.f2;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj51/e;", "Lyq0/b0;", "Lyq0/a0;", "Ld51/g;", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends l<yq0.a0> implements d51.g {
    public static final /* synthetic */ int E0 = 0;
    public f2 A0;
    public GestaltButton B0;
    public d51.f C0;
    public final d4 D0 = d4.USER_BOARD_RESTORATION;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f74739z0;

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE, new w01.e0(this, 23));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        f2 f2Var = this.A0;
        if (f2Var == null) {
            Intrinsics.r("boardRestorePresenterFactory");
            throw null;
        }
        uk1.e eVar = this.f74739z0;
        if (eVar != null) {
            return f2Var.a(((uk1.a) eVar).g());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getL0() {
        return this.D0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(nz1.d.fragment_boards_restore, nz1.c.restore_boards_recycler_view);
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        final int i13 = 0;
        ((GestaltIconButton) view.findViewById(nz1.c.close_button)).u(new gm1.a(this) { // from class: j51.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f74715b;

            {
                this.f74715b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                e this$0 = this.f74715b;
                switch (i14) {
                    case 0:
                        int i15 = e.E0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        d51.f fVar = this$0.C0;
                        if (fVar != null) {
                            ((g51.e) fVar).i();
                            break;
                        }
                        break;
                    default:
                        int i16 = e.E0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        d51.f fVar2 = this$0.C0;
                        if (fVar2 != null) {
                            ((g51.e) fVar2).u3();
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById = view.findViewById(nz1.c.restore);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        bs1.c.s(gestaltButton, d.f74718k);
        final int i14 = 1;
        this.B0 = gestaltButton.e(new gm1.a(this) { // from class: j51.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f74715b;

            {
                this.f74715b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                e this$0 = this.f74715b;
                switch (i142) {
                    case 0:
                        int i15 = e.E0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        d51.f fVar = this$0.C0;
                        if (fVar != null) {
                            ((g51.e) fVar).i();
                            break;
                        }
                        break;
                    default:
                        int i16 = e.E0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        d51.f fVar2 = this$0.C0;
                        if (fVar2 != null) {
                            ((g51.e) fVar2).u3();
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById2 = view.findViewById(nz1.c.description);
        GestaltText gestaltText = (GestaltText) findViewById2;
        String string = gestaltText.getResources().getString(nz1.f.recently_deleted);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = gestaltText.getResources().getString(nz1.f.board_restoration_modal_message, 7, string);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Spanned fromHtml = Html.fromHtml(string2, 0);
        Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
        SpannableStringBuilder string3 = new SpannableStringBuilder(fromHtml);
        Intrinsics.checkNotNullParameter(string3, "string");
        pk.a0.q(gestaltText, new u50.f0(string3));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
    }
}

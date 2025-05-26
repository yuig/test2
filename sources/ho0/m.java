package ho0;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.feature.pin.RepinAnimationData;
import com.pinterest.feature.pin.create.view.HeaderCell;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.m3;
import df.j1;
import go0.s;
import h32.d4;
import java.util.ArrayList;
import kg.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import m60.w;
import rm1.q;
import so.n2;
import x02.i2;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u00020\u0005B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lho0/m;", "Lho0/d;", "Lfo0/c;", "Lnr0/j;", "Ldl1/s;", "Lf11/h;", "<init>", "()V", "repin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class m extends h implements fo0.c {
    public static final /* synthetic */ int N1 = 0;
    public Boolean A1;
    public boolean B1;
    public w C1;
    public b60.b D1;
    public i2 E1;
    public uk1.d F1;
    public n2 G1;
    public il1.a H1;
    public lu1.b I1;
    public z70.m J1;
    public i92.k K1;
    public f0 L1;
    public ac2.m M1;

    /* renamed from: g1, reason: collision with root package name */
    public s f69723g1;

    /* renamed from: h1, reason: collision with root package name */
    public String f69724h1;

    /* renamed from: i1, reason: collision with root package name */
    public String f69725i1;

    /* renamed from: k1, reason: collision with root package name */
    public Uri f69727k1;

    /* renamed from: l1, reason: collision with root package name */
    public String f69728l1;

    /* renamed from: m1, reason: collision with root package name */
    public String f69729m1;

    /* renamed from: n1, reason: collision with root package name */
    public String f69730n1;

    /* renamed from: o1, reason: collision with root package name */
    public boolean f69731o1;

    /* renamed from: p1, reason: collision with root package name */
    public int f69732p1;

    /* renamed from: q1, reason: collision with root package name */
    public String f69733q1;

    /* renamed from: r1, reason: collision with root package name */
    public boolean f69734r1;

    /* renamed from: s1, reason: collision with root package name */
    public String f69735s1;

    /* renamed from: u1, reason: collision with root package name */
    public d4 f69737u1;

    /* renamed from: v1, reason: collision with root package name */
    public boolean f69738v1;

    /* renamed from: w1, reason: collision with root package name */
    public boolean f69739w1;

    /* renamed from: x1, reason: collision with root package name */
    public RepinAnimationData f69740x1;

    /* renamed from: y1, reason: collision with root package name */
    public String f69741y1;

    /* renamed from: z1, reason: collision with root package name */
    public String f69742z1;

    /* renamed from: j1, reason: collision with root package name */
    public String f69726j1 = "";

    /* renamed from: t1, reason: collision with root package name */
    public ArrayList f69736t1 = new ArrayList();

    @Override // k11.e
    public final String N3(Uri uri, Bitmap bitmap, boolean z13) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String c13 = qb0.b.c(requireContext(), uri, bitmap, null, null, z13);
        Intrinsics.checkNotNullExpressionValue(c13, "decodeImageUri(...)");
        return c13;
    }

    @Override // nl1.d, ec2.o
    public final ac2.m P0() {
        ac2.m mVar = this.M1;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.r("repinBoardSectionVideoManager");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    @Override // yk1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yk1.m V7() {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ho0.m.V7():yk1.m");
    }

    @Override // k11.e
    public final String X1() {
        Intent intent;
        FragmentActivity E4 = E4();
        Bundle extras = (E4 == null || (intent = E4.getIntent()) == null) ? null : intent.getExtras();
        if (extras != null) {
            return extras.getString("com.pinterest.EXTRA_PARTNER_ID");
        }
        return null;
    }

    @Override // k11.e
    public final void g0(int i13) {
        i92.k kVar = this.K1;
        if (kVar != null) {
            kVar.h(i13);
        } else {
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    @Override // k11.e
    /* renamed from: g3, reason: from getter */
    public final String getF81427f1() {
        return this.f69735s1;
    }

    @Override // k11.e
    public final void h4(String str, String boardName, String str2, String str3) {
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        z70.m mVar = this.J1;
        if (mVar == null) {
            Intrinsics.r("chromeTabHelper");
            throw null;
        }
        if (mVar.e()) {
            z70.m mVar2 = this.J1;
            if (mVar2 == null) {
                Intrinsics.r("chromeTabHelper");
                throw null;
            }
            if (mVar2.d()) {
                String string = getString(e02.e.saved_to_board_section);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String Y = j1.Y(string, new Object[]{this.f69730n1}, null, 6);
                Context context = getContext();
                if (context != null) {
                    Spanned fromHtml = Html.fromHtml(Y);
                    Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                    o.M(1, context, fromHtml);
                }
            }
        }
        m9();
    }

    @Override // k11.e
    public final boolean isBound() {
        return this.f91282J;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ho0.m.m9():void");
    }

    public final void n9(String boardSectionId, String parentBoardId, String boardSectionTitle) {
        Intrinsics.checkNotNullParameter(boardSectionId, "boardSectionId");
        Intrinsics.checkNotNullParameter(parentBoardId, "parentBoardId");
        Intrinsics.checkNotNullParameter(boardSectionTitle, "boardSectionTitle");
        String string = getResources().getString(e02.e.saved_to_board_section);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String Y = j1.Y(string, new Object[]{boardSectionTitle}, null, 6);
        if (E4() instanceof MainActivity) {
            NavigationImpl z03 = Navigation.z0(m3.c(), boardSectionId);
            z03.m0("com.pinterest.EXTRA_BOARD_ID", parentBoardId);
            i92.k kVar = this.K1;
            if (kVar != null) {
                kVar.c(new lr.j(z03, Y, null));
                return;
            } else {
                Intrinsics.r("toastUtils");
                throw null;
            }
        }
        Context context = getContext();
        if (context != null) {
            CharSequence text = j1.a0(Y);
            Intrinsics.checkNotNullExpressionValue(text, "fromHtml(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(text, "text");
            Toast.makeText(context, text, 1).show();
        }
    }

    @Override // ho0.d, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        this.f69728l1 = bundle != null ? bundle.getString("com.pinterest.EXTRA_DESCRIPTION") : null;
        HeaderCell h93 = h9();
        h93.a0(f02.g.save_pin_to);
        h93.setContentDescription(getResources().getString(f02.g.save_pin_to));
        h93.X(q.ARROW_BACK);
        return onCreateView;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        int i13 = 0;
        int i14 = 1;
        if (this.f69736t1.size() > 1) {
            c8(new a(this, i14));
            c8(new a(this, i13));
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(f02.a.board_picker_padding);
        a8(new com.pinterest.feature.home.view.f(dimensionPixelSize, dimensionPixelSize, 0, 3));
    }

    @Override // k11.e
    public final String s2() {
        Intent intent;
        FragmentActivity E4 = E4();
        Bundle extras = (E4 == null || (intent = E4.getIntent()) == null) ? null : intent.getExtras();
        if (extras != null) {
            return extras.getString("com.pinterest.EXTRA_VIRTUAL_TRY_ON_TAGGED_IDS");
        }
        return null;
    }

    @Override // k11.e
    public final void w3(String str) {
        i92.k kVar = this.K1;
        if (kVar != null) {
            kVar.i(str);
        } else {
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    @Override // k11.e
    public final String z1() {
        Intent intent;
        FragmentActivity E4 = E4();
        Bundle extras = (E4 == null || (intent = E4.getIntent()) == null) ? null : intent.getExtras();
        String string = extras != null ? extras.getString("com.pinterest.EXTRA_PIN_CREATE_TYPE") : null;
        if (string != null) {
            return string;
        }
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_PIN_CREATE_TYPE") : null;
        return v03 == null ? "" : v03;
    }
}

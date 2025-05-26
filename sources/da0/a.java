package da0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import ca0.p;
import ca0.r0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.t;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lr.j;
import lr.l;
import u50.r;

/* loaded from: classes5.dex */
public final class a implements k11.e {

    /* renamed from: a, reason: collision with root package name */
    public final r f54201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f54202b;

    public a(f fVar, r0 request, r eventIntake) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.f54202b = fVar;
        this.f54201a = eventIntake;
    }

    @Override // k11.e
    public final String N3(Uri uri, Bitmap bitmap, boolean z13) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String c13 = qb0.b.c(this.f54202b.f54213a, uri, bitmap, null, null, z13);
        Intrinsics.checkNotNullExpressionValue(c13, "decodeImageUri(...)");
        return c13;
    }

    @Override // k11.e
    public final String X1() {
        return null;
    }

    @Override // k11.e
    public final void g0(int i13) {
        f fVar = this.f54202b;
        fVar.f54217e.i(fVar.f54213a.getString(i13));
    }

    @Override // k11.e
    /* renamed from: g3 */
    public final String getF69735s1() {
        return null;
    }

    @Override // k11.e
    public final void h4(String str, String boardName, String str2, String str3) {
        we0.a lVar;
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        String R0 = dl2.b.R0(str);
        String R02 = dl2.b.R0(str2);
        if (R02 == null || (z.p(R02, "http", false) && z.h(R02, ".jpg", false))) {
            R02 = null;
        }
        f fVar = this.f54202b;
        if (R0 == null || R02 == null) {
            lVar = R0 != null ? new l(R0, boardName, str3, null, fVar.f54222j) : new l(str3, ((b60.d) fVar.f54221i).g());
        } else {
            Resources resources = fVar.f54213a.getResources();
            NavigationImpl z03 = Navigation.z0((ScreenLocation) t.f51364e.getValue(), R02);
            z03.m0("com.pinterest.EXTRA_BOARD_ID", R0);
            lVar = new j(z03, j1.X(resources.getString(l70.d.saved_to_board_section), boardName), str3);
        }
        fVar.f54217e.c(lVar);
        this.f54201a.a(p.f27150a);
    }

    @Override // k11.e
    public final boolean isBound() {
        return true;
    }

    @Override // k11.e
    public final String s2() {
        return null;
    }

    @Override // k11.e
    public final void w3(String str) {
        this.f54202b.f54217e.i(str);
    }

    @Override // k11.e
    public final String z1() {
        return g.Collage.getValue();
    }
}

package fs0;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.l1;
import lh0.z3;

/* loaded from: classes5.dex */
public final class a extends n {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f62829d;

    /* renamed from: e, reason: collision with root package name */
    public final String f62830e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f62831f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z13, jo1.a baseFragmentType, ls0.f viewParams, String pinNavigationSource, boolean z14) {
        super(baseFragmentType, viewParams);
        Intrinsics.checkNotNullParameter(baseFragmentType, "baseFragmentType");
        Intrinsics.checkNotNullParameter(viewParams, "viewParams");
        Intrinsics.checkNotNullParameter(pinNavigationSource, "pinNavigationSource");
        this.f62829d = z13;
        this.f62830e = pinNavigationSource;
        this.f62831f = z14;
    }

    @Override // fs0.n
    public final List a(l config) {
        Intrinsics.checkNotNullParameter(config, "config");
        ArrayList l13 = f0.l(es0.a.DIVIDER_WITH_BOTTOM_SPACE);
        int size = l13.size();
        boolean z13 = config.f62871d;
        l1 l1Var = this.f62885c;
        ls0.f fVar = this.f62884b;
        if (z13 || config.f62872e) {
            l13.add(es0.a.SECTION_HEADER_MANAGE);
            l13.add(es0.a.EDIT);
        } else if (fVar.G) {
            l1Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) l1Var.f83416a;
            if (g1Var.o("android_overflow_genai_modified", "enabled", z3Var) || g1Var.l("android_overflow_genai_modified")) {
                l13.add(es0.a.LEARN_MORE_ABOUT_GEN_AI);
            }
        }
        if (l13.size() != size) {
            l13.add(es0.a.SECTION_HEADER_MORE);
        }
        boolean z14 = config.f62881n;
        if (z14) {
            l13.add(es0.a.CLICKTHROUGH);
        }
        boolean z15 = config.f62868a && this.f62831f;
        if (z15) {
            l13.add(es0.a.FOLLOW_UNFOLLOW_PIN_CREATOR);
        }
        Integer valueOf = Integer.valueOf(le0.d.menu_clickthrough);
        List list = config.f62870c;
        boolean contains = list.contains(valueOf);
        boolean z16 = config.f62874g;
        if (contains && !z16 && !z14) {
            l13.add(es0.a.CLICKTHROUGH);
        }
        if (list.contains(Integer.valueOf(le0.d.menu_react))) {
            l13.add(es0.a.REACT);
        }
        if (list.contains(Integer.valueOf(le0.d.menu_send))) {
            l13.add(es0.a.SEND);
        }
        if (list.contains(Integer.valueOf(le0.d.menu_promote))) {
            l13.add(es0.a.PROMOTE);
        }
        l13.add(es0.a.COPY_LINK);
        if (fVar.B) {
            l1Var.getClass();
            z3 z3Var2 = a4.f83297a;
            g1 g1Var2 = (g1) l1Var.f83416a;
            if (g1Var2.o("android_pin_overflow_show_remix_item", "enabled", z3Var2) || g1Var2.l("android_pin_overflow_show_remix_item")) {
                l13.add(es0.a.REMIX_COLLAGE);
            }
        }
        if (n.b(fVar.f84637l, z16, config.f62876i)) {
            l13.add(es0.a.DOWNLOAD);
        }
        if (fVar.A) {
            l13.add(es0.a.ADD_TO_COLLAGE);
        }
        if (d() && !z15) {
            l13.add(es0.a.UNFOLLOW);
        }
        if (this.f62829d) {
            if (config.f62873f || !Intrinsics.d(this.f62830e, "feed_home")) {
                l13.add(es0.a.HIDE);
            } else {
                l13.add(es0.a.STOP_SEEING_PIN);
            }
        }
        if (!z13) {
            l13.add(es0.a.REPORT);
        }
        if (config.f62869b) {
            l13.add(es0.a.REMOVE_MENTION);
        }
        l13.add(es0.a.DIVIDER_WITH_TOP_SPACE);
        return l13;
    }
}

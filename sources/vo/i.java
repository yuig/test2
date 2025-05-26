package vo;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewStub;
import com.pinterest.api.model.hz;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.shuffles.scene.composer.SceneView;
import h32.a4;
import h32.d4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.a0;
import lh0.g1;
import lh0.z3;

/* loaded from: classes3.dex */
public final class i implements oe0.h, x72.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126366a;

    public /* synthetic */ i(int i13) {
        this.f126366a = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.Serializable] */
    public static u01.v a(Navigation navigation, a0 experiments) {
        String str;
        String str2;
        int i13;
        ?? serializable;
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        boolean S = navigation.S("com.pinterest.EXTRA_FROM_PIN_IT", false);
        String f49940b = navigation.getF49940b();
        Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
        String navigationSource = navigation.v0("com.pinterest.EXTRA_RELATED_PINS_TRAFFIC_SOURCE");
        String str3 = "unknown";
        if (navigationSource == null || navigationSource.length() == 0 || z.i(navigationSource, "unknown", true)) {
            d4 f49944f = navigation.getF49944f();
            if (f49944f != null) {
                Set set = jq.e.f77414a;
                str = "feed";
                switch (jq.d.f77413a[f49944f.ordinal()]) {
                    case 1:
                    case 2:
                        str = "board";
                        break;
                    case 3:
                        str = "bubble";
                        break;
                    case 4:
                    case 8:
                        break;
                    case 5:
                        str = "flashlight";
                        break;
                    case 6:
                    case 7:
                        str = "lens";
                        break;
                    case 9:
                        str = "notifications";
                        break;
                    default:
                        str = f49944f.toString().toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                        break;
                }
            } else {
                str = null;
            }
            if (CollectionsKt.L(jq.e.f77414a, str) && str != null) {
                str3 = str;
            }
            navigationSource = str3;
        }
        String v03 = navigation.v0("com.pinterest.EXTRA_SOURCE_QUERY");
        u01.u uVar = new u01.u(navigation.v0("com.pinterest.EXTRA_COMMENT_ID"), navigation.v0("com.pinterest.EXTRA_COMMENT_TYPE"), navigation.v0("com.pinterest.EXTRA_REPLY_ID"), navigation.v0("com.pinterest.EXTRA_USER_ID"), S ? f49940b : null, navigation.S("com.pinterest.EXTRA_COMMENT_IS_HIDDEN", false), S);
        a4 a4Var = navigation.S("com.pinterest.EXTRA_CLOSEUP_FROM_PINCH_TO_ZOOM", false) ? a4.FLASHLIGHT_PINCH_TO_ZOOM : null;
        String v04 = navigation.v0("com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE");
        boolean d2 = Intrinsics.d(navigationSource, "ad_preview");
        int J1 = navigation.J1("com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE_DEPTH");
        if (Intrinsics.d(navigationSource, "pin")) {
            str2 = v04;
            i13 = J1 + 1;
        } else {
            str2 = navigationSource;
            i13 = 1;
        }
        boolean S2 = navigation.S("com.pinterest.SHOW_REACTION_LIST", false);
        String v05 = navigation.v0("com.pinterest.TRACKING_PARAMETER");
        String v06 = navigation.v0("com.pinterest.CURRENT_URL");
        String v07 = navigation.v0("com.pinterest.TRACKING_PARAMETER");
        a11.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        a11.b bVar = Intrinsics.d(navigationSource, "deep_linking") ? a11.b.Deeplink : !navigation.S("com.pinterest.EXTRA_NAVIGATION_FROM_FEED", true) ? a11.b.Swipe : a11.b.Feed;
        z3 z3Var = lh0.a4.f83298b;
        g1 g1Var = (g1) experiments.f83294a;
        if (g1Var.o("android_notif_landing_context_fix", "enabled", z3Var) || g1Var.l("android_notif_landing_context_fix")) {
            String v08 = navigation.v0("com.pinterest.EXTRA_NOTIF_LANDING_CONTEXT_UTM_SOURCE");
            String v09 = navigation.v0("com.pinterest.EXTRA_NOTIF_LANDING_CONTEXT_MESSAGE_TYPE");
            String v010 = navigation.v0("com.pinterest.EXTRA_NOTIF_LANDING_CONTEXT_TRACKING_ID");
            if (v08 != null && v09 != null && v010 != null) {
                r13 = new hz(v08, v09, v010);
            }
        } else if (Build.VERSION.SDK_INT >= 33) {
            NavigationImpl navigationImpl = navigation instanceof NavigationImpl ? (NavigationImpl) navigation : null;
            if (navigationImpl != null) {
                Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_NOTIF_LANDING_CONTEXT", "key");
                Intrinsics.checkNotNullParameter(hz.class, "clazz");
                serializable = navigationImpl.f49942d.getSerializable("com.pinterest.EXTRA_NOTIF_LANDING_CONTEXT", hz.class);
                r13 = serializable != 0 ? serializable : null;
            }
        } else {
            Serializable Z0 = navigation.Z0("com.pinterest.EXTRA_NOTIF_LANDING_CONTEXT", null);
            if (Z0 instanceof hz) {
                r13 = (hz) Z0;
            }
        }
        i01.p pVar = new i01.p(v07, bVar, r13);
        ArrayList arrayList = new ArrayList();
        ArrayList M = navigation.M("com.pinterest.EXTRA_CONTEXT_PIN_IDS");
        if (M != null) {
            if (M.size() > 5) {
                M.remove(0);
            }
            arrayList.addAll(M);
        }
        arrayList.add(f49940b);
        return new u01.v(f49940b, navigationSource, v03, S2, v05, v06, a4Var, pVar, uVar, d2, str2, i13, arrayList, navigation.v0("com.pinterest.EXTRA_CLOSEUP_MODULE_SOURCE"));
    }

    @Override // oe0.h
    public boolean b(String errorMessage, View anchorView, String invokerTag, boolean z13) {
        switch (this.f126366a) {
            case 0:
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                Intrinsics.checkNotNullParameter(anchorView, "anchorView");
                Intrinsics.checkNotNullParameter(invokerTag, "invokerTag");
                break;
            default:
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                Intrinsics.checkNotNullParameter(anchorView, "anchorView");
                Intrinsics.checkNotNullParameter(invokerTag, "invokerTag");
                break;
        }
        return true;
    }

    @Override // oe0.h
    public boolean c() {
        return true;
    }

    @Override // x72.k
    public x72.j n(Context context) {
        switch (this.f126366a) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                me2.c backend = me2.c.GLES;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(backend, "backend");
                x72.h hVar = new x72.h(context, null);
                hVar.m(backend);
                return hVar;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                me2.c backend2 = me2.c.VULKAN;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(backend2, "backend");
                x72.h hVar2 = new x72.h(context, null);
                hVar2.m(backend2);
                return hVar2;
        }
    }

    @Override // x72.k
    public x72.j p(ViewStub stub) {
        switch (this.f126366a) {
            case 0:
                Intrinsics.checkNotNullParameter(stub, "stub");
                me2.c backend = me2.c.GLES;
                Intrinsics.checkNotNullParameter(stub, "stub");
                Intrinsics.checkNotNullParameter(backend, "backend");
                stub.setLayoutResource(x72.a.view_scene_view);
                stub.setInflatedId(stub.getId());
                View inflate = stub.inflate();
                Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.shuffles.scene.composer.SceneView");
                SceneView sceneView = (SceneView) inflate;
                sceneView.m(backend);
                return new x72.f(sceneView);
            default:
                Intrinsics.checkNotNullParameter(stub, "stub");
                me2.c backend2 = me2.c.VULKAN;
                Intrinsics.checkNotNullParameter(stub, "stub");
                Intrinsics.checkNotNullParameter(backend2, "backend");
                stub.setLayoutResource(x72.a.view_scene_view);
                stub.setInflatedId(stub.getId());
                View inflate2 = stub.inflate();
                Intrinsics.g(inflate2, "null cannot be cast to non-null type com.pinterest.shuffles.scene.composer.SceneView");
                SceneView sceneView2 = (SceneView) inflate2;
                sceneView2.m(backend2);
                return new x72.f(sceneView2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13, int i14) {
        this(0);
        this.f126366a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
            default:
                break;
        }
    }
}

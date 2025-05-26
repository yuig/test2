package l31;

import b31.f;
import com.pinterest.api.model.v7;
import com.pinterest.feature.pin.r;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.i3;
import g70.h;
import h32.f1;
import i92.k;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m31.e;
import m60.w;
import nx.b0;
import nx.d0;
import uj2.q;
import x02.i2;
import x02.x0;
import yk1.t;

/* loaded from: classes5.dex */
public final class d extends t implements j31.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f81508a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81509b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f81510c;

    /* renamed from: d, reason: collision with root package name */
    public final k f81511d;

    /* renamed from: e, reason: collision with root package name */
    public final w f81512e;

    /* renamed from: f, reason: collision with root package name */
    public final x0 f81513f;

    /* renamed from: g, reason: collision with root package name */
    public final r f81514g;

    /* renamed from: h, reason: collision with root package name */
    public final b0 f81515h;

    /* renamed from: i, reason: collision with root package name */
    public final String f81516i;

    /* renamed from: j, reason: collision with root package name */
    public final String f81517j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f81518k;

    /* renamed from: l, reason: collision with root package name */
    public final String f81519l;

    /* renamed from: m, reason: collision with root package name */
    public final String f81520m;

    /* renamed from: n, reason: collision with root package name */
    public final String f81521n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f81522o;

    /* renamed from: p, reason: collision with root package name */
    public final h f81523p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f81524q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String deselectedPinIds, List selectedPinIds, q networkStateStream, uk1.d presenterPinalytics, i2 pinRepository, k toastUtils, w eventManager, x0 boardRepository, r repinAnimationUtil, b0 pinAuxHelper, String boardName, String pinClusterId, boolean z13, String str, String repinId, String str2, boolean z14, h boardNavigator) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(deselectedPinIds, "deselectedPinIds");
        Intrinsics.checkNotNullParameter(selectedPinIds, "selectedPinIds");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(pinClusterId, "pinClusterId");
        Intrinsics.checkNotNullParameter(repinId, "repinId");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f81508a = deselectedPinIds;
        this.f81509b = selectedPinIds;
        this.f81510c = pinRepository;
        this.f81511d = toastUtils;
        this.f81512e = eventManager;
        this.f81513f = boardRepository;
        this.f81514g = repinAnimationUtil;
        this.f81515h = pinAuxHelper;
        this.f81516i = boardName;
        this.f81517j = pinClusterId;
        this.f81518k = z13;
        this.f81519l = str;
        this.f81520m = repinId;
        this.f81521n = str2;
        this.f81522o = z14;
        this.f81523p = boardNavigator;
        this.f81524q = true;
    }

    public static final void p3(d dVar, v7 v7Var) {
        if (dVar.isBound()) {
            h.f(dVar.f81523p, v7Var, new b(dVar, 0), 2);
        }
        za.c remove = Navigation.remove();
        remove.a(Navigation.w1((ScreenLocation) i3.f50986t.getValue()));
        remove.a(Navigation.w1((ScreenLocation) i3.f50978l.getValue()));
        remove.a(Navigation.w1((ScreenLocation) i3.f50977k.getValue()));
        remove.a(Navigation.w1((ScreenLocation) i3.f50987u.getValue()));
        remove.a(Navigation.w1((ScreenLocation) i3.f50971e.getValue()));
        dVar.f81512e.d(remove);
    }

    public final HashMap q3(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("cluster_selected_index", this.f81517j);
        hashMap.put("cluster_selected_name", this.f81516i);
        String str2 = this.f81519l;
        if (str2 != null) {
            hashMap.put("navigation_source", str2);
        }
        if (str != null) {
            hashMap.put("board_title", str);
            hashMap.put("did_user_use_suggestion", String.valueOf(this.f81524q));
        }
        return hashMap;
    }

    @Override // yk1.p
    public final void r3(j31.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        e eVar = (e) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        eVar.f85778t0 = this;
        String name = this.f81516i;
        Intrinsics.checkNotNullParameter(name, "name");
        GestaltTextField gestaltTextField = eVar.f85776r0;
        if (gestaltTextField == null) {
            Intrinsics.r("editText");
            throw null;
        }
        gestaltTextField.X(new f(name, 1));
        gestaltTextField.d0();
        j31.a aVar = eVar.f85778t0;
        if (aVar != null) {
            ((d) aVar).f81524q = true;
        }
        if (this.f81518k) {
            d0.B(getPinalytics(), f1.AUTO_BOARD_NAME_INPUT_VIEW_BEGIN, null, null, q3(null), 22);
        }
    }
}

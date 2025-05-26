package ni1;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public final class u0 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f90807a;

    /* renamed from: b, reason: collision with root package name */
    public final int f90808b;

    /* renamed from: c, reason: collision with root package name */
    public final Pair f90809c;

    /* renamed from: d, reason: collision with root package name */
    public final bb2.i f90810d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f90811e;

    /* renamed from: f, reason: collision with root package name */
    public final t0 f90812f;

    /* renamed from: g, reason: collision with root package name */
    public final u50.i0 f90813g;

    /* renamed from: h, reason: collision with root package name */
    public final u50.n f90814h;

    /* renamed from: i, reason: collision with root package name */
    public final h32.g0 f90815i;

    /* renamed from: j, reason: collision with root package name */
    public final q0 f90816j;

    /* renamed from: k, reason: collision with root package name */
    public final l0 f90817k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f90818l;

    /* renamed from: m, reason: collision with root package name */
    public final dk1.b f90819m;

    /* renamed from: n, reason: collision with root package name */
    public final ek1.r f90820n;

    /* renamed from: o, reason: collision with root package name */
    public final gk1.l f90821o;

    /* renamed from: p, reason: collision with root package name */
    public final hk1.g f90822p;

    /* renamed from: q, reason: collision with root package name */
    public final fk1.d f90823q;

    /* renamed from: r, reason: collision with root package name */
    public final ck1.a f90824r;

    /* renamed from: s, reason: collision with root package name */
    public final bk1.o f90825s;

    /* renamed from: t, reason: collision with root package name */
    public final b3 f90826t;

    /* renamed from: u, reason: collision with root package name */
    public final ti1.a f90827u;

    public u0(f30 deprecatedPinModel, int i13, Pair tag, bb2.i iVar, boolean z13, t0 hidePieces, u50.i0 contentDescription, u50.n appliedCornerRadius, h32.g0 componentType, q0 backgroundOverride, l0 pinRepAction, boolean z14, dk1.b headerZone, ek1.r mediaZone, gk1.l overlayZone, hk1.g trailingAccessoryZone, fk1.d metadataZone, ck1.a footerZone, bk1.o clickThrough, b3 requestLayout, ti1.a aVar) {
        Intrinsics.checkNotNullParameter(deprecatedPinModel, "deprecatedPinModel");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(hidePieces, "hidePieces");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(appliedCornerRadius, "appliedCornerRadius");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(backgroundOverride, "backgroundOverride");
        Intrinsics.checkNotNullParameter(pinRepAction, "pinRepAction");
        Intrinsics.checkNotNullParameter(headerZone, "headerZone");
        Intrinsics.checkNotNullParameter(mediaZone, "mediaZone");
        Intrinsics.checkNotNullParameter(overlayZone, "overlayZone");
        Intrinsics.checkNotNullParameter(trailingAccessoryZone, "trailingAccessoryZone");
        Intrinsics.checkNotNullParameter(metadataZone, "metadataZone");
        Intrinsics.checkNotNullParameter(footerZone, "footerZone");
        Intrinsics.checkNotNullParameter(clickThrough, "clickThrough");
        Intrinsics.checkNotNullParameter(requestLayout, "requestLayout");
        this.f90807a = deprecatedPinModel;
        this.f90808b = i13;
        this.f90809c = tag;
        this.f90810d = iVar;
        this.f90811e = z13;
        this.f90812f = hidePieces;
        this.f90813g = contentDescription;
        this.f90814h = appliedCornerRadius;
        this.f90815i = componentType;
        this.f90816j = backgroundOverride;
        this.f90817k = pinRepAction;
        this.f90818l = z14;
        this.f90819m = headerZone;
        this.f90820n = mediaZone;
        this.f90821o = overlayZone;
        this.f90822p = trailingAccessoryZone;
        this.f90823q = metadataZone;
        this.f90824r = footerZone;
        this.f90825s = clickThrough;
        this.f90826t = requestLayout;
        this.f90827u = aVar;
    }

    public static u0 e(u0 u0Var, int i13, Pair pair, bb2.i iVar, boolean z13, t0 t0Var, u50.i0 i0Var, u50.n nVar, h32.g0 g0Var, q0 q0Var, l0 l0Var, boolean z14, dk1.b bVar, ek1.r rVar, gk1.l lVar, hk1.g gVar, fk1.d dVar, ck1.a aVar, bk1.o oVar, b3 b3Var, ti1.a aVar2, int i14) {
        boolean z15;
        hk1.g trailingAccessoryZone;
        bb2.i iVar2;
        fk1.d metadataZone;
        int i15;
        ck1.a aVar3;
        ck1.a aVar4;
        bk1.o oVar2;
        bk1.o oVar3;
        b3 requestLayout;
        f30 deprecatedPinModel = u0Var.f90807a;
        int i16 = (i14 & 2) != 0 ? u0Var.f90808b : i13;
        Pair tag = (i14 & 4) != 0 ? u0Var.f90809c : pair;
        bb2.i iVar3 = (i14 & 8) != 0 ? u0Var.f90810d : iVar;
        boolean z16 = (i14 & 16) != 0 ? u0Var.f90811e : z13;
        t0 hidePieces = (i14 & 32) != 0 ? u0Var.f90812f : t0Var;
        u50.i0 contentDescription = (i14 & 64) != 0 ? u0Var.f90813g : i0Var;
        u50.n appliedCornerRadius = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? u0Var.f90814h : nVar;
        h32.g0 componentType = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? u0Var.f90815i : g0Var;
        q0 backgroundOverride = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? u0Var.f90816j : q0Var;
        l0 pinRepAction = (i14 & 1024) != 0 ? u0Var.f90817k : l0Var;
        boolean z17 = (i14 & 2048) != 0 ? u0Var.f90818l : z14;
        dk1.b headerZone = (i14 & 4096) != 0 ? u0Var.f90819m : bVar;
        ek1.r mediaZone = (i14 & 8192) != 0 ? u0Var.f90820n : rVar;
        boolean z18 = z17;
        gk1.l overlayZone = (i14 & 16384) != 0 ? u0Var.f90821o : lVar;
        if ((i14 & 32768) != 0) {
            z15 = z16;
            trailingAccessoryZone = u0Var.f90822p;
        } else {
            z15 = z16;
            trailingAccessoryZone = gVar;
        }
        if ((i14 & 65536) != 0) {
            iVar2 = iVar3;
            metadataZone = u0Var.f90823q;
        } else {
            iVar2 = iVar3;
            metadataZone = dVar;
        }
        if ((i14 & 131072) != 0) {
            i15 = i16;
            aVar3 = u0Var.f90824r;
        } else {
            i15 = i16;
            aVar3 = aVar;
        }
        if ((i14 & 262144) != 0) {
            aVar4 = aVar3;
            oVar2 = u0Var.f90825s;
        } else {
            aVar4 = aVar3;
            oVar2 = oVar;
        }
        if ((i14 & 524288) != 0) {
            oVar3 = oVar2;
            requestLayout = u0Var.f90826t;
        } else {
            oVar3 = oVar2;
            requestLayout = b3Var;
        }
        ti1.a aVar5 = (i14 & 1048576) != 0 ? u0Var.f90827u : aVar2;
        u0Var.getClass();
        Intrinsics.checkNotNullParameter(deprecatedPinModel, "deprecatedPinModel");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(hidePieces, "hidePieces");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(appliedCornerRadius, "appliedCornerRadius");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(backgroundOverride, "backgroundOverride");
        Intrinsics.checkNotNullParameter(pinRepAction, "pinRepAction");
        Intrinsics.checkNotNullParameter(headerZone, "headerZone");
        Intrinsics.checkNotNullParameter(mediaZone, "mediaZone");
        Intrinsics.checkNotNullParameter(overlayZone, "overlayZone");
        Intrinsics.checkNotNullParameter(trailingAccessoryZone, "trailingAccessoryZone");
        Intrinsics.checkNotNullParameter(metadataZone, "metadataZone");
        ti1.a aVar6 = aVar5;
        ck1.a footerZone = aVar4;
        Intrinsics.checkNotNullParameter(footerZone, "footerZone");
        bk1.o clickThrough = oVar3;
        Intrinsics.checkNotNullParameter(clickThrough, "clickThrough");
        Intrinsics.checkNotNullParameter(requestLayout, "requestLayout");
        return new u0(deprecatedPinModel, i15, tag, iVar2, z15, hidePieces, contentDescription, appliedCornerRadius, componentType, backgroundOverride, pinRepAction, z18, headerZone, mediaZone, overlayZone, trailingAccessoryZone, metadataZone, aVar4, clickThrough, requestLayout, aVar6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.f90807a, u0Var.f90807a) && this.f90808b == u0Var.f90808b && Intrinsics.d(this.f90809c, u0Var.f90809c) && Intrinsics.d(this.f90810d, u0Var.f90810d) && this.f90811e == u0Var.f90811e && Intrinsics.d(this.f90812f, u0Var.f90812f) && Intrinsics.d(this.f90813g, u0Var.f90813g) && Intrinsics.d(this.f90814h, u0Var.f90814h) && this.f90815i == u0Var.f90815i && Intrinsics.d(this.f90816j, u0Var.f90816j) && Intrinsics.d(this.f90817k, u0Var.f90817k) && this.f90818l == u0Var.f90818l && Intrinsics.d(this.f90819m, u0Var.f90819m) && Intrinsics.d(this.f90820n, u0Var.f90820n) && Intrinsics.d(this.f90821o, u0Var.f90821o) && Intrinsics.d(this.f90822p, u0Var.f90822p) && Intrinsics.d(this.f90823q, u0Var.f90823q) && Intrinsics.d(this.f90824r, u0Var.f90824r) && Intrinsics.d(this.f90825s, u0Var.f90825s) && Intrinsics.d(this.f90826t, u0Var.f90826t) && Intrinsics.d(this.f90827u, u0Var.f90827u);
    }

    public final int hashCode() {
        int hashCode = (this.f90809c.hashCode() + ep.b.b(this.f90808b, this.f90807a.hashCode() * 31, 31)) * 31;
        bb2.i iVar = this.f90810d;
        int hashCode2 = (this.f90826t.hashCode() + ((this.f90825s.f23274a.hashCode() + ep.b.c(this.f90824r.f27906a, ep.b.c(this.f90823q.f62348a, ep.b.c(this.f90822p.f69351a, (this.f90821o.hashCode() + ((this.f90820n.hashCode() + ep.b.c(this.f90819m.f55161a, ep.b.e(this.f90818l, (this.f90817k.hashCode() + ((this.f90816j.hashCode() + ((this.f90815i.hashCode() + d7.g.e(this.f90814h, ep.b.d(this.f90813g, (this.f90812f.hashCode() + ep.b.e(this.f90811e, (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31, 31)) * 31, 31), 31)) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31, 31), 31), 31)) * 31)) * 31;
        ti1.a aVar = this.f90827u;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "PinRepDisplayState(deprecatedPinModel=" + this.f90807a + ", position=" + this.f90808b + ", tag=" + this.f90809c + ", resolvedFixedHeightImageSpec=" + this.f90810d + ", showOverflow=" + this.f90811e + ", hidePieces=" + this.f90812f + ", contentDescription=" + this.f90813g + ", appliedCornerRadius=" + this.f90814h + ", componentType=" + this.f90815i + ", backgroundOverride=" + this.f90816j + ", pinRepAction=" + this.f90817k + ", isDLCollectionEnabled=" + this.f90818l + ", headerZone=" + this.f90819m + ", mediaZone=" + this.f90820n + ", overlayZone=" + this.f90821o + ", trailingAccessoryZone=" + this.f90822p + ", metadataZone=" + this.f90823q + ", footerZone=" + this.f90824r + ", clickThrough=" + this.f90825s + ", requestLayout=" + this.f90826t + ", wrapperCalcFields=" + this.f90827u + ")";
    }

    public u0(f30 f30Var, int i13, n0 n0Var, int i14) {
        this((i14 & 1) != 0 ? a2.f90595a : f30Var, (i14 & 2) != 0 ? 0 : i13, new Pair(Integer.valueOf(e0.f90642a), null), null, true, s0.f90792a, u50.h0.f120562a, new u50.b0(eo1.c.lego_corner_radius_medium), h32.g0.FLOWED_PIN, (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? n0.f90743a : n0Var, g0.f90685a, false, new dk1.b(), new ek1.r(), new gk1.l(), new hk1.g(), new fk1.d(), new ck1.a(), new bk1.o(), z2.f90931a, null);
    }
}

package mu0;

import android.content.Context;
import android.graphics.Point;
import android.opengl.GLES20;
import android.view.ViewGroup;
import ao2.j0;
import com.pinterest.xrenderer.RustBridge$Scene;
import h32.f1;
import h32.u0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh2.n3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.g0;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.ranges.IntRange;
import kv0.p;
import m60.w;
import nx.d0;
import oo2.o;
import ql2.k;
import qo2.v;
import sf1.e1;
import tj0.z;
import ul2.q1;
import ul2.u1;
import ul2.w1;
import w21.y0;
import w21.y1;
import wa2.m;
import xk2.x;
import xk2.y;

/* loaded from: classes5.dex */
public final class i extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88300i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f88301j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f88302k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f88303l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i13, String str, v vVar) {
        super(0);
        this.f88300i = 9;
        this.f88301j = i13;
        this.f88303l = str;
        this.f88302k = vVar;
    }

    public final ke2.d b() {
        int i13;
        Object obj;
        ee2.e eVar;
        int i14;
        Object obj2;
        int b13;
        switch (this.f88300i) {
            case 6:
                he2.f fVar = (he2.f) this.f88302k;
                if (fVar.f68976d) {
                    return null;
                }
                if (!fVar.f68984l) {
                    he2.c block = new he2.c(fVar, 7);
                    Intrinsics.checkNotNullParameter("", "tag");
                    Intrinsics.checkNotNullParameter(block, "block");
                    Intrinsics.checkNotNullParameter("", "tag");
                    Intrinsics.checkNotNullParameter(block, "block");
                    block.invoke();
                }
                he2.a aVar = fVar.f68983k;
                p scene = (p) fVar.f68987o.f56383d;
                Point position = (Point) this.f88303l;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(position, "position");
                if (!ig1.b.U(aVar.f68963b).contains(position.x, position.y)) {
                    throw new IllegalArgumentException(("can't hit-test out of the view bounds: position: " + position + ", view size: " + aVar.f68963b).toString());
                }
                if (aVar.f68962a.capacity() <= 0) {
                    throw new IllegalStateException("index data is unavailable. You should updateIndexData(...) at least once before querying items".toString());
                }
                int width = aVar.f68963b.getWidth();
                int height = aVar.f68963b.getHeight();
                int i15 = this.f88301j;
                int max = Math.max(4, (int) Math.ceil(i15 / Math.min((i15 * 2) + 1, 160)));
                int i16 = -i15;
                kotlin.ranges.a p13 = ql2.s.p(new IntRange(i16, i15, 1), max);
                ArrayList arrayList = new ArrayList();
                k it = p13.iterator();
                while (it.f104109c) {
                    Object next = it.next();
                    int intValue = position.x + ((Number) next).intValue();
                    if (intValue >= 0 && intValue < width) {
                        arrayList.add(next);
                    }
                }
                kotlin.ranges.a p14 = ql2.s.p(new IntRange(i16, i15, 1), max);
                ArrayList arrayList2 = new ArrayList();
                k it2 = p14.iterator();
                while (it2.f104109c) {
                    Object next2 = it2.next();
                    int intValue2 = position.y + ((Number) next2).intValue();
                    if (intValue2 >= 0 && intValue2 < height) {
                        arrayList2.add(next2);
                    }
                }
                int i17 = i15 * i15;
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    int i18 = 10;
                    if (!it3.hasNext()) {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            Object next3 = it4.next();
                            Pair pair = (Pair) next3;
                            int intValue3 = ((Number) pair.f80346a).intValue();
                            int intValue4 = ((Number) pair.f80347b).intValue();
                            if ((intValue4 * intValue4) + (intValue3 * intValue3) <= i17) {
                                arrayList4.add(next3);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(g0.q(arrayList4, 10));
                        Iterator it5 = arrayList4.iterator();
                        while (it5.hasNext()) {
                            Pair pair2 = (Pair) it5.next();
                            arrayList5.add(new Point(position.x + ((Number) pair2.f80346a).intValue(), position.y + ((Number) pair2.f80347b).intValue()));
                        }
                        List x03 = CollectionsKt.x0(arrayList5, new s4.g(position, i18));
                        byte[] bArr = {0, 0, 0, 0};
                        Iterator it6 = x03.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                Point point = (Point) it6.next();
                                aVar.f68962a.position(((aVar.f68963b.getWidth() * ((aVar.f68963b.getHeight() - point.y) - 1)) + point.x) * 4);
                                aVar.f68962a.get(bArr);
                                aVar.f68962a.rewind();
                                if (bArr[3] == 0) {
                                    i14 = -1;
                                } else {
                                    byte b14 = bArr[0];
                                    x xVar = y.f135237b;
                                    i14 = ((bArr[1] & 255) * 255) + (b14 & 255);
                                }
                                if (i14 >= 0) {
                                    Iterator it7 = ((List) scene.f80994a).iterator();
                                    while (true) {
                                        if (it7.hasNext()) {
                                            Object next4 = it7.next();
                                            if (((ee2.e) next4).f58824a.f58818c == i14) {
                                                obj2 = next4;
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    eVar = (ee2.e) obj2;
                                }
                            } else {
                                if (bArr[3] == 0) {
                                    i13 = -1;
                                } else {
                                    byte b15 = bArr[0];
                                    x xVar2 = y.f135237b;
                                    i13 = ((bArr[1] & 255) * 255) + (b15 & 255);
                                }
                                Iterator it8 = ((List) scene.f80994a).iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        Object next5 = it8.next();
                                        if (((ee2.e) next5).f58824a.f58818c == i13) {
                                            obj = next5;
                                        }
                                    } else {
                                        obj = null;
                                    }
                                }
                                eVar = (ee2.e) obj;
                            }
                        }
                        return fVar.f68987o.g(eVar);
                    }
                    int intValue5 = ((Number) it3.next()).intValue();
                    ArrayList arrayList6 = new ArrayList(g0.q(arrayList, 10));
                    Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        arrayList6.add(new Pair(Integer.valueOf(((Number) it9.next()).intValue()), Integer.valueOf(intValue5)));
                    }
                    k0.u(arrayList6, arrayList3);
                }
                break;
            default:
                ((me2.f) this.f88302k).f87056i = false;
                ke2.f fVar2 = ((me2.f) this.f88302k).f87051d;
                if (fVar2 != null) {
                    Point position2 = (Point) this.f88303l;
                    float f13 = this.f88301j;
                    Intrinsics.checkNotNullParameter(position2, "position");
                    int stickerIdAtPosition = !fVar2.a() ? -1 : RustBridge$Scene.f52862a.stickerIdAtPosition(fVar2.f79327d, position2.x, position2.y, f13);
                    if (stickerIdAtPosition >= 0 && (b13 = fVar2.b(stickerIdAtPosition)) >= 0) {
                        return fVar2.f79324a.a(new pn1.g(b13, 18));
                    }
                }
                return null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f88300i;
        Object obj = this.f88302k;
        Object obj2 = this.f88303l;
        int i14 = this.f88301j;
        switch (i13) {
            case 0:
                m189invoke();
                return Unit.f80348a;
            case 1:
                dx0.y yVar = (dx0.y) obj;
                Context context = yVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                z zVar = new z(context, yVar.f56470b, (m) obj2, yVar.f56469a);
                zVar.setLayoutParams(new ViewGroup.LayoutParams(i14, -2));
                return zVar;
            case 2:
                m189invoke();
                return Unit.f80348a;
            case 3:
                m189invoke();
                return Unit.f80348a;
            case 4:
                m189invoke();
                return Unit.f80348a;
            case 5:
                m189invoke();
                return Unit.f80348a;
            case 6:
                return b();
            case 7:
                return b();
            case 8:
                q1 q1Var = (q1) obj;
                w1 w1Var = q1Var.f122586b;
                Type type = w1Var != null ? (Type) w1Var.invoke() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    Intrinsics.f(componentType);
                    return componentType;
                }
                if (type instanceof GenericArrayType) {
                    if (i14 == 0) {
                        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                        Intrinsics.f(genericComponentType);
                        return genericComponentType;
                    }
                    throw new u1("Array type has been queried for a non-0th argument: " + q1Var);
                }
                if (!(type instanceof ParameterizedType)) {
                    throw new u1("Non-generic type has been queried for arguments: " + q1Var);
                }
                Type type2 = (Type) ((List) ((xk2.k) obj2).getValue()).get(i14);
                if (type2 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Intrinsics.checkNotNullExpressionValue(lowerBounds, "getLowerBounds(...)");
                    Type type3 = (Type) c0.C(lowerBounds);
                    if (type3 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                        type2 = (Type) c0.B(upperBounds);
                    } else {
                        type2 = type3;
                    }
                }
                Intrinsics.f(type2);
                return type2;
            default:
                oo2.g[] gVarArr = new oo2.g[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    gVarArr[i15] = n3.o(((String) obj2) + '.' + ((v) obj).f104660e[i15], o.f96906d, new oo2.g[0], oo2.k.f96900i);
                }
                return gVarArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, int i13, Object obj2, int i14) {
        super(0);
        this.f88300i = i14;
        this.f88302k = obj;
        this.f88301j = i13;
        this.f88303l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Object obj2, int i13, int i14) {
        super(0);
        this.f88300i = i14;
        this.f88302k = obj;
        this.f88303l = obj2;
        this.f88301j = i13;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m189invoke() {
        int i13 = this.f88300i;
        Object obj = this.f88303l;
        int i14 = this.f88301j;
        Object obj2 = this.f88302k;
        switch (i13) {
            case 0:
                j jVar = (j) obj2;
                jVar.getPinalytics().X(u0.COMPLETE_BUTTON);
                String draftId = (String) obj;
                de0.d dVar = jVar.f88310g;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(draftId, "draftId");
                xd0.f fVar = dVar.f54556a;
                fVar.getClass();
                xj2.c o13 = de0.d.e(new fk2.h(new f0.e(5, fVar, draftId), 2)).r(tk2.e.f118017c).l(wj2.c.a()).o(new a(5, new f(jVar, i14, 1)), new a(6, e.f88291l));
                Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                jVar.addDisposable(o13);
                break;
            case 1:
            default:
                GLES20.glFramebufferTexture2D(((yd2.j) obj2).f138807b.getGlValue(), i14 + 36064, 3553, ((ae2.d) obj).f15063b, 0);
                break;
            case 2:
                kotlin.jvm.internal.j.z((j0) obj2, null, null, new y0((y1) obj, i14, null), 3);
                break;
            case 3:
                ((Function1) obj2).invoke(((Pair) ((List) obj).get(i14)).f80346a);
                break;
            case 4:
                e1 e1Var = (e1) obj2;
                d0 d0Var = e1Var.f112545d;
                f1 f1Var = f1.TAP;
                qf1.o oVar = (qf1.o) obj;
                String a13 = oVar.a();
                d0Var.N(f1Var, u0.MUSIC_PLAYLIST_ATTRIBUTION, h32.g0.MODAL_PIN, a13, false);
                w eventManager = e1Var.getEventManager();
                String pinUid = oVar.a();
                Integer valueOf = Integer.valueOf(i14);
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                eventManager.d(new jc0.v(new zt1.d(pinUid, valueOf), false, 0L, 30));
                break;
        }
    }
}

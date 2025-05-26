package u62;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.net.Uri;
import android.util.Size;
import ao2.j0;
import ao2.v0;
import com.pinterest.shuffles.core.ui.model.BitmapMaskModel;
import com.pinterest.shuffles.core.ui.model.MaskModel;
import do2.a2;
import do2.t2;
import do2.u2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kh2.b0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import r72.g2;
import r72.i1;
import r72.j1;
import s2.y;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Context f120876a;

    /* renamed from: b, reason: collision with root package name */
    public final t72.l f120877b;

    /* renamed from: c, reason: collision with root package name */
    public final t72.l f120878c;

    /* renamed from: d, reason: collision with root package name */
    public final h72.b f120879d;

    /* renamed from: e, reason: collision with root package name */
    public final n72.m f120880e;

    /* renamed from: f, reason: collision with root package name */
    public final n72.a f120881f;

    /* renamed from: g, reason: collision with root package name */
    public final t2 f120882g;

    /* renamed from: h, reason: collision with root package name */
    public final a2 f120883h;

    /* renamed from: i, reason: collision with root package name */
    public final t2 f120884i;

    /* renamed from: j, reason: collision with root package name */
    public final a2 f120885j;

    /* renamed from: k, reason: collision with root package name */
    public j0 f120886k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f120887l;

    /* renamed from: m, reason: collision with root package name */
    public q72.g f120888m;

    /* renamed from: n, reason: collision with root package name */
    public Uri f120889n;

    /* renamed from: o, reason: collision with root package name */
    public ve.h f120890o;

    /* renamed from: p, reason: collision with root package name */
    public Size f120891p;

    /* renamed from: q, reason: collision with root package name */
    public i1 f120892q;

    /* renamed from: r, reason: collision with root package name */
    public yk2.b f120893r;

    /* renamed from: s, reason: collision with root package name */
    public String f120894s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f120895t;

    /* renamed from: u, reason: collision with root package name */
    public int f120896u;

    /* renamed from: v, reason: collision with root package name */
    public int f120897v;

    public t(Context context, t72.l getSegmentedObjectsForPinUseCase, t72.l getSegmentedObjectsForImageUseCase, h72.b cutoutEditorImageInteractor, m72.a shuffleCoreLogger, n72.a dispatcherProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(getSegmentedObjectsForPinUseCase, "getSegmentedObjectsForPinUseCase");
        Intrinsics.checkNotNullParameter(getSegmentedObjectsForImageUseCase, "getSegmentedObjectsForImageUseCase");
        Intrinsics.checkNotNullParameter(cutoutEditorImageInteractor, "cutoutEditorImageInteractor");
        Intrinsics.checkNotNullParameter(shuffleCoreLogger, "shuffleCoreLogger");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.f120876a = context;
        this.f120877b = getSegmentedObjectsForPinUseCase;
        this.f120878c = getSegmentedObjectsForImageUseCase;
        this.f120879d = cutoutEditorImageInteractor;
        this.f120880e = shuffleCoreLogger;
        this.f120881f = dispatcherProvider;
        t2 a13 = u2.a(new c(new u(null, null, null), "H,1:1", e.f120836a, false));
        this.f120882g = a13;
        this.f120883h = new a2(a13);
        t2 a14 = u2.a(null);
        this.f120884i = a14;
        this.f120885j = new a2(a14);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(android.net.Uri r24, u62.t r25, java.lang.String r26, bl2.c r27) {
        /*
            r0 = r25
            r1 = r27
            r25.getClass()
            boolean r2 = r1 instanceof u62.m
            if (r2 == 0) goto L1a
            r2 = r1
            u62.m r2 = (u62.m) r2
            int r3 = r2.f120849u
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f120849u = r3
            goto L1f
        L1a:
            u62.m r2 = new u62.m
            r2.<init>(r0, r1)
        L1f:
            java.lang.Object r1 = r2.f120847s
            cl2.a r3 = cl2.a.COROUTINE_SUSPENDED
            int r4 = r2.f120849u
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L3a
            if (r4 != r6) goto L32
            java.lang.String r0 = r2.f120846r
            ue.c.H(r1)
            r11 = r0
            goto L59
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            ue.c.H(r1)
            r1 = r26
            r2.f120846r = r1
            r2.f120849u = r6
            h72.b r0 = r0.f120879d
            n72.a r4 = r0.f67953b
            ao2.f0 r4 = r4.f89706b
            h72.a r6 = new h72.a
            r7 = r24
            r6.<init>(r0, r7, r5)
            java.lang.Object r0 = kotlin.jvm.internal.j.M(r2, r4, r6)
            if (r0 != r3) goto L57
            goto L90
        L57:
            r11 = r1
            r1 = r0
        L59:
            android.util.Size r1 = (android.util.Size) r1
            r72.x0 r13 = r72.x0.f106703e
            q72.b r0 = new q72.b
            r20 = 0
            r21 = 0
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            java.lang.String r12 = ""
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r6 = r0
            r7 = r11
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            q72.g r3 = new q72.g
            int r2 = q72.h.f102843a
            r72.i1 r2 = new r72.i1
            int r4 = r72.g2.f106487b
            java.lang.String r4 = "M0 0H1V1H0Z"
            r2.<init>(r4, r5)
            java.lang.String r4 = "none"
            r3.<init>(r4, r1, r0, r2)
        L90:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: u62.t.a(android.net.Uri, u62.t, java.lang.String, bl2.c):java.lang.Object");
    }

    public static final void b(t tVar, Uri uri) {
        Object value;
        if (tVar.f120891p != null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) com.bumptech.glide.b.f(tVar.f120876a).c().J(uri).L(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
            tVar.f120891p = new Size(bitmap.getWidth(), bitmap.getHeight());
            t2 t2Var = tVar.f120882g;
            do {
                value = t2Var.getValue();
            } while (!t2Var.h(value, c.a((c) value, null, "H," + bitmap.getWidth() + ":" + bitmap.getHeight(), null, false, 13)));
        } catch (Exception e13) {
            tVar.f120880e.d(e13, new yv1.i(uri, 22));
        }
    }

    public static void g(t tVar, j0 viewModelScope, ve.h cutoutEditorInputType, Integer num, i1 i1Var, int i13) {
        t2 t2Var;
        Object value;
        c cVar;
        i1 i1Var2;
        u a13;
        String str;
        Object value2;
        if ((i13 & 4) != 0) {
            num = null;
        }
        if ((i13 & 8) != 0) {
            i1Var = null;
        }
        tVar.getClass();
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(cutoutEditorInputType, "cutoutEditorInputType");
        tVar.f120886k = viewModelScope;
        tVar.f120887l = num;
        tVar.f120890o = cutoutEditorInputType;
        tVar.f120889n = cutoutEditorInputType.s();
        tVar.f120891p = cutoutEditorInputType.B();
        do {
            t2Var = tVar.f120882g;
            value = t2Var.getValue();
            cVar = (c) value;
            u uVar = cVar.f120828a;
            Uri uri = tVar.f120889n;
            if (uri == null) {
                Intrinsics.r("initialImageUri");
                throw null;
            }
            String uri2 = uri.toString();
            if (i1Var == null) {
                int i14 = g2.f106487b;
                i1Var2 = new i1("M0 0H1V1H0Z", null);
            } else {
                i1Var2 = i1Var;
            }
            a13 = u.a(uVar, uri2, i1Var2, null, 4);
            Size size = tVar.f120891p;
            if (size == null || (str = a.a.f("H,", size.getWidth(), ":", size.getHeight())) == null) {
                str = "H,1:1";
            }
        } while (!t2Var.h(value, c.a(cVar, a13, str, null, false, 12)));
        if (i1Var != null) {
            tVar.i(i1Var, false);
            return;
        }
        if (!(cutoutEditorInputType instanceof b)) {
            if (cutoutEditorInputType instanceof a) {
                Uri s13 = cutoutEditorInputType.s();
                tVar.h();
                j0 j0Var = tVar.f120886k;
                if (j0Var == null) {
                    Intrinsics.r("viewModelScope");
                    throw null;
                }
                ko2.f fVar = v0.f20219a;
                kotlin.jvm.internal.j.z(j0Var, ko2.e.f80326c, null, new q(tVar, s13, null), 2);
                return;
            }
            return;
        }
        b bVar = (b) cutoutEditorInputType;
        Uri s14 = cutoutEditorInputType.s();
        tVar.h();
        do {
            value2 = t2Var.getValue();
        } while (!t2Var.h(value2, c.a((c) value2, null, null, h.f120839a, false, 11)));
        j0 j0Var2 = tVar.f120886k;
        if (j0Var2 == null) {
            Intrinsics.r("viewModelScope");
            throw null;
        }
        ko2.f fVar2 = v0.f20219a;
        kotlin.jvm.internal.j.z(j0Var2, ko2.e.f80326c, null, new r(s14, tVar, bVar.f120826c, null), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cf, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r8, "M0 0H0Z") == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.pinterest.shuffles.core.ui.model.MaskModel r21, bl2.c r22) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u62.t.c(com.pinterest.shuffles.core.ui.model.MaskModel, bl2.c):java.lang.Object");
    }

    public final Object d(bl2.c cVar) {
        MaskModel maskModel;
        i1 mask = this.f120892q;
        BitmapMaskModel bitmapMaskModel = null;
        if (mask != null) {
            Intrinsics.checkNotNullParameter(mask, "mask");
            String str = mask.f106498a;
            if (str == null) {
                str = null;
            }
            r72.a aVar = mask.f106499b;
            if (aVar != null) {
                j1 j1Var = aVar.f106431a;
                bitmapMaskModel = new BitmapMaskModel(j1Var.f106506a, j1Var.f106507b, j1Var.f106508c, j1Var.f106509d, aVar.f106432b);
            }
            maskModel = new MaskModel(str, bitmapMaskModel);
        } else {
            Intrinsics.checkNotNullParameter(i1.f106497c, "mask");
            maskModel = new MaskModel(null, null);
        }
        return c(maskModel, cVar);
    }

    public final void e(k event) {
        ArrayList arrayList;
        Object value;
        c cVar;
        u uVar;
        i1 i1Var;
        ArrayList arrayList2;
        g2 g2Var;
        Object value2;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z13 = event instanceof j;
        t2 t2Var = this.f120882g;
        if (z13) {
            do {
                value2 = t2Var.getValue();
            } while (!t2Var.h(value2, c.a((c) value2, null, null, null, true, 7)));
            return;
        }
        if (event instanceof i) {
            i iVar = (i) event;
            int i13 = iVar.f120840a;
            int i14 = (int) iVar.f120842c;
            int i15 = (int) iVar.f120843d;
            ArrayList arrayList3 = this.f120895t;
            int i16 = iVar.f120841b;
            if (arrayList3 == null || this.f120896u != i13 || this.f120897v != i16) {
                this.f120896u = i13;
                this.f120897v = i16;
                yk2.b bVar = this.f120893r;
                if (bVar != null) {
                    arrayList = new ArrayList(g0.q(bVar, 10));
                    ListIterator listIterator = bVar.listIterator(0);
                    while (true) {
                        y yVar = (y) listIterator;
                        if (!yVar.hasNext()) {
                            break;
                        }
                        String str = ((g2) yVar.next()).f106488a;
                        RectF rectF = new RectF();
                        Path T1 = b0.T1(this.f120896u, this.f120897v, str);
                        T1.computeBounds(rectF, true);
                        Region region = new Region();
                        Rect rect = new Rect();
                        rectF.roundOut(rect);
                        region.setPath(T1, new Region(rect));
                        arrayList.add(region);
                    }
                } else {
                    arrayList = null;
                }
                this.f120895t = arrayList;
            }
            ArrayList arrayList4 = this.f120895t;
            if (arrayList4 != null) {
                Iterator it = arrayList4.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    } else if (((Region) it.next()).contains(i14, i15)) {
                        break;
                    } else {
                        i17++;
                    }
                }
                Integer valueOf = Integer.valueOf(i17);
                if (i17 == -1) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    yk2.b bVar2 = this.f120893r;
                    String str2 = (bVar2 == null || (g2Var = (g2) bVar2.get(intValue)) == null) ? null : g2Var.f106488a;
                    this.f120894s = str2;
                    this.f120892q = str2 != null ? new i1(str2, null) : null;
                    do {
                        value = t2Var.getValue();
                        cVar = (c) value;
                        uVar = cVar.f120828a;
                        i1Var = this.f120892q;
                        yk2.b bVar3 = this.f120893r;
                        if (bVar3 != null) {
                            arrayList2 = new ArrayList();
                            ListIterator listIterator2 = bVar3.listIterator(0);
                            while (true) {
                                y yVar2 = (y) listIterator2;
                                if (!yVar2.hasNext()) {
                                    break;
                                }
                                Object next = yVar2.next();
                                String str3 = ((g2) next).f106488a;
                                if (!(this.f120894s == null ? false : Intrinsics.d(str3, r11))) {
                                    arrayList2.add(next);
                                }
                            }
                        } else {
                            arrayList2 = null;
                        }
                    } while (!t2Var.h(value, c.a(cVar, u.a(uVar, null, i1Var, arrayList2, 1), null, null, false, 14)));
                    j();
                }
            }
        }
    }

    public final void f(q72.g gVar) {
        t2 t2Var;
        Object value;
        this.f120888m = gVar;
        this.f120892q = null;
        do {
            t2Var = this.f120882g;
            value = t2Var.getValue();
        } while (!t2Var.h(value, c.a((c) value, null, null, d.f120835a, false, 11)));
        j();
    }

    public final void h() {
        t2 t2Var;
        Object value;
        c cVar;
        this.f120893r = null;
        this.f120895t = null;
        this.f120894s = null;
        this.f120892q = null;
        this.f120896u = 0;
        this.f120897v = 0;
        do {
            t2Var = this.f120882g;
            value = t2Var.getValue();
            cVar = (c) value;
        } while (!t2Var.h(value, c.a(cVar, u.a(cVar.f120828a, null, null, null, 1), null, null, false, 14)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f0, code lost:
    
        if (r4 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f4, code lost:
    
        if (r4 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(r72.i1 r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u62.t.i(r72.i1, boolean):void");
    }

    public final void j() {
        j0 j0Var = this.f120886k;
        if (j0Var != null) {
            kotlin.jvm.internal.j.z(j0Var, this.f120881f.f89707c, null, new s(this, null), 2);
        } else {
            Intrinsics.r("viewModelScope");
            throw null;
        }
    }
}

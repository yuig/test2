package jm0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh2.g3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import l82.c0;
import l82.h0;
import lm0.c1;
import lm0.e0;
import lm0.g0;
import lm0.r0;
import lm0.x0;
import lm0.y0;
import lm0.z0;
import o82.b1;
import o82.d1;
import o82.i0;
import o82.i1;
import o82.i2;
import o82.n1;
import u50.k0;
import um0.u0;

/* loaded from: classes5.dex */
public final class z extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final om0.b0 f77013b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f77014c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f77015d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f77016e;

    /* renamed from: f, reason: collision with root package name */
    public final h0 f77017f;

    public z(lt.j boardToolsStateTransformer, u0 organizeStateTransformer, i0 multiSectionStateTransformer, lt.j pinalyticsStateTransformer, om0.p metadataCreator) {
        Intrinsics.checkNotNullParameter(boardToolsStateTransformer, "boardToolsStateTransformer");
        Intrinsics.checkNotNullParameter(organizeStateTransformer, "organizeStateTransformer");
        Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        Intrinsics.checkNotNullParameter(metadataCreator, "metadataCreator");
        this.f77013b = metadataCreator;
        this.f77014c = b(boardToolsStateTransformer, new d0() { // from class: jm0.p
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((lm0.a) obj).f83838h;
            }
        }, new d0() { // from class: jm0.q
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((x0) obj).f83913g;
            }
        }, r.f77000j);
        this.f77015d = b(organizeStateTransformer, new d0() { // from class: jm0.u
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((lm0.a) obj).f83839i;
            }
        }, new d0() { // from class: jm0.v
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((x0) obj).f83914h;
            }
        }, r.f77002l);
        this.f77016e = b(multiSectionStateTransformer, new d0() { // from class: jm0.s
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((lm0.a) obj).f83840j;
            }
        }, new d0() { // from class: jm0.t
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((x0) obj).f83915i;
            }
        }, r.f77001k);
        this.f77017f = b(pinalyticsStateTransformer, new d0() { // from class: jm0.w
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((lm0.a) obj).f83841k;
            }
        }, new d0() { // from class: jm0.x
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((x0) obj).f83916j;
            }
        }, r.f77003m);
    }

    public static void m(l82.e eVar, boolean z13) {
        lm0.a aVar = (lm0.a) eVar.f82218a;
        sk0.d dVar = aVar.f83838h;
        List list = dVar.f113049a;
        List list2 = aVar.f83839i.f122698d;
        boolean z14 = dVar.f113052d;
        eVar.f(new y(z13 ? wm0.a.NoToolsNoHeader : z14 && (list2.isEmpty() ^ true) ? wm0.a.OrganizeTools : !z14 && (list.isEmpty() ^ true) ? wm0.a.BaseTools : wm0.a.NoTools, 0));
    }

    @Override // l82.d
    public final c0 c(l82.i0 i0Var) {
        x0 vmState = (x0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        int i13 = y60.e.board_all_saves_fragment_title;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        l82.e d2 = l82.d.d(new lm0.a(new k0(i13, new ArrayList(0)), om0.o.f96550d, y0.f83919a, lm0.e.f83859b, true, wm0.a.NoTools, true, lm0.d0.f83856a, lm0.d0.f83857b, new o82.a0(), new zy.a0()), vmState);
        bk.f.T(d2, this.f77014c);
        bk.f.T(d2, this.f77015d);
        bk.f.T(d2, this.f77016e);
        bk.f.T(d2, this.f77017f);
        d2.d(new g0(new pm0.d0(vmState.f83907a, false)), lm0.k0.f83876a);
        return d2.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0174, code lost:
    
        r20 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x024b, code lost:
    
        if ((!r4.isEmpty()) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x024d, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r60, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "lens");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "events");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "$events");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "$lens");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r60, "resultBuilder");
        r4 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0269, code lost:
    
        if (r4.hasNext() == false) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026b, code lost:
    
        r3.a((u50.s) r4.next(), r60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0275, code lost:
    
        r4 = (lm0.a) r60.f82218a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0285, code lost:
    
        if ((!kh2.g3.k2(r7).isEmpty()) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x028f, code lost:
    
        if (kh2.g3.k2(r4).isEmpty() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0291, code lost:
    
        i(r60, lm0.c1.AllPins);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0178, code lost:
    
        r4 = kh2.g3.k2((lm0.a) r60.f82218a);
        r5 = new java.util.ArrayList();
        r4 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x018f, code lost:
    
        if (r4.hasNext() == false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0191, code lost:
    
        r8 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x019e, code lost:
    
        if (((lm0.c0) r8).f83849a.E5() != null) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01a0, code lost:
    
        r5.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01a4, code lost:
    
        r4 = new java.util.ArrayList(kotlin.collections.g0.q(r5, 10));
        r5 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01b7, code lost:
    
        if (r5.hasNext() == false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01b9, code lost:
    
        r4.add(new o82.e0(lm0.e0.BoardPins.getId(), new o82.l1((lm0.c0) r5.next())));
        r5 = r5;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01db, code lost:
    
        r20 = r13;
        r4 = kh2.g3.k2((lm0.a) r60.f82218a);
        r5 = new java.util.ArrayList();
        r4 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01f4, code lost:
    
        if (r4.hasNext() == false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01f6, code lost:
    
        r8 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0209, code lost:
    
        if ((!((lm0.c0) r8).f83849a.o4().booleanValue()) == false) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x020b, code lost:
    
        r5.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0090, code lost:
    
        if (((o82.f0) r5).f93579a == r2.getIndex()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x020f, code lost:
    
        r4 = new java.util.ArrayList(kotlin.collections.g0.q(r5, 10));
        r5 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0222, code lost:
    
        if (r5.hasNext() == false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0224, code lost:
    
        r4.add(new o82.e0(lm0.e0.BoardPins.getId(), new o82.l1((lm0.c0) r5.next())));
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00f9, code lost:
    
        r5 = !kh2.g3.S(r7).isEmpty();
        r19 = !kh2.g3.S(r4).isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x010c, code lost:
    
        if (r5 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x010e, code lost:
    
        if (r19 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0110, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0113, code lost:
    
        if (r19 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a8, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "<this>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0115, code lost:
    
        if (r5 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0117, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x011a, code lost:
    
        if (r12 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x011c, code lost:
    
        if (r5 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x011f, code lost:
    
        r5 = !kh2.g3.m2(r7).isEmpty();
        r4 = !kh2.g3.m2(r4).isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0132, code lost:
    
        if (r5 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0134, code lost:
    
        if (r4 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0136, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0139, code lost:
    
        if (r4 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x013b, code lost:
    
        if (r5 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ab, code lost:
    
        if (r4 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x013d, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0140, code lost:
    
        if (r12 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0142, code lost:
    
        if (r4 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0145, code lost:
    
        r19 = "event";
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x013f, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0138, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0119, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0112, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00b4, code lost:
    
        if ((r5 instanceof o82.e0) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ad, code lost:
    
        r2 = ((o82.f0) r5).f93580b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00b6, code lost:
    
        r2 = ((o82.e0) r5).f93567b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x00bb, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x00a6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(((o82.e0) r5).f93566a, r2.getId()) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bc, code lost:
    
        if (r2 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bf, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c7, code lost:
    
        if ((r2 instanceof o82.o1) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cb, code lost:
    
        if ((r2 instanceof o82.p1) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ce, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d3, code lost:
    
        if ((r2 instanceof o82.l1) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d6, code lost:
    
        r19 = "event";
        r20 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0296, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x029b, code lost:
    
        if ((r2 instanceof o82.m1) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x029f, code lost:
    
        if ((r2 instanceof o82.z0) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x02a1, code lost:
    
        r4 = (lm0.a) r60.f82218a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "<this>");
        r4 = (o82.y0) kotlin.collections.CollectionsKt.U(lm0.e0.BoardPins.getIndex(), r4.f83840j.f93524a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02b8, code lost:
    
        if (r4 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02bc, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "<this>");
        r5 = o82.t.f93712e;
        r7 = r4.f93757b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x02c7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r7, r5) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x02cb, code lost:
    
        if ((r2 instanceof o82.z0) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02cd, code lost:
    
        r2 = (o82.z0) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x02d1, code lost:
    
        if (r2 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x02d3, code lost:
    
        r2 = r2.f93764a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02d5, code lost:
    
        if (r2 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02d7, code lost:
    
        r8 = new java.util.ArrayList();
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02e6, code lost:
    
        if (r2.hasNext() == false) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02e8, code lost:
    
        r12 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02ee, code lost:
    
        if ((r12 instanceof lm0.c0) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02f0, code lost:
    
        r12 = (lm0.c0) r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02f4, code lost:
    
        if (r12 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02f6, code lost:
    
        r12 = r12.f83849a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x02fa, code lost:
    
        if (r12 == null) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02fc, code lost:
    
        r8.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02f9, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02f3, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0300, code lost:
    
        r13 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0303, code lost:
    
        if (r13 != null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0305, code lost:
    
        r13 = kotlin.collections.q0.f80391a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0310, code lost:
    
        if ((!r13.isEmpty()) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0312, code lost:
    
        r12 = new um0.x[]{new um0.t(r13)};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r60, "<this>");
        r2 = r20;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "lens");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, "events");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, "$events");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "$lens");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r60, "resultBuilder");
        r8 = r12.length;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0334, code lost:
    
        if (r13 >= r8) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0336, code lost:
    
        r2.a(r12[r13], r60);
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0302, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02d0, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x033e, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "<this>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0348, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r7, r5) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x034c, code lost:
    
        if (r4.f93758c != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x034e, code lost:
    
        r2 = (lm0.x0) r60.f82219b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0356, code lost:
    
        if (r2.f83918l != lm0.c1.AllPins) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0358, code lost:
    
        r60.a(kh2.k3.a2(r2, h32.f1.BOARD_END, null, null, h32.g0.DYNAMIC_GRID_STORY, null, 46));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x036d, code lost:
    
        r2 = (lm0.a) r60.f82218a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
        r2 = (o82.y0) kotlin.collections.CollectionsKt.U(lm0.e0.BoardSections.getIndex(), r2.f83840j.f93524a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0384, code lost:
    
        if (r2 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0388, code lost:
    
        if (r2.f93759d != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x038a, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x038d, code lost:
    
        r4 = !r4.f93759d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0391, code lost:
    
        if (r2 != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0393, code lost:
    
        if (r4 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0396, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x039b, code lost:
    
        r4 = lm0.e0.EmptyState.getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x03a3, code lost:
    
        if (r16 == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x03a5, code lost:
    
        r5 = o82.d1.f93561a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x03aa, code lost:
    
        r2 = new o82.e0(r4, r5);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r60, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "lens");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r19);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "$lens");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r59);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r60, "resultBuilder");
        r3.a(r2, r60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03a8, code lost:
    
        r5 = o82.n1.f93676a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0399, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x038c, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00dc, code lost:
    
        r4 = (lm0.a) r60.f82218a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00ec, code lost:
    
        if ((!kh2.g3.k2(r7).isEmpty()) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00f6, code lost:
    
        if (kh2.g3.k2(r4).isEmpty() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0148, code lost:
    
        r19 = "event";
        r60.a(new lm0.g0(new pm0.d0(((lm0.x0) r60.f82219b).f83907a, true)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015e, code lost:
    
        r4 = jm0.o.f76997a[((lm0.x0) r60.f82219b).f83918l.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016d, code lost:
    
        if (r4 == 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0170, code lost:
    
        if (r4 == 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0172, code lost:
    
        r4 = kotlin.collections.q0.f80391a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0413  */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v64, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r56v0, types: [java.lang.Object, jm0.z] */
    /* JADX WARN: Type inference failed for: r8v51, types: [java.util.ArrayList] */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r57, u50.o r58, l82.i0 r59, l82.e r60) {
        /*
            Method dump skipped, instructions count: 2772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jm0.z.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }

    public final void g(um0.x event, l82.e resultBuilder) {
        um0.e eVar = ((lm0.a) resultBuilder.f82218a).f83839i;
        resultBuilder.f(h.f76973o);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        h0 lens = this.f77015d;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(event, "$event");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.a(event, resultBuilder);
        j(resultBuilder, eVar);
        k(resultBuilder, false);
    }

    public final void h(l82.e resultBuilder, wa2.m featureConfig) {
        e0 e0Var = e0.BoardPins;
        String id3 = e0Var.getId();
        x0 x0Var = (x0) resultBuilder.f82219b;
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        km0.a w13 = g3.w(x0Var);
        o82.g0[] events = {new o82.e0(id3, new b1(w13 != null ? km0.a.a(w13, featureConfig, null, 0, false, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL) : g3.i2(x0Var, featureConfig, null, 0, false, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL), false)), new o82.e0(e0Var.getId(), new i1(new nm0.b(featureConfig)))};
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        h0 lens = this.f77016e;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(events, "$events");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        for (o82.g0 g0Var : events) {
            lens.a(g0Var, resultBuilder);
        }
    }

    public final void i(l82.e resultBuilder, c1 filter) {
        z0 z0Var = ((x0) resultBuilder.f82219b).f83912f;
        c1 c1Var = z0Var.f83922a;
        resultBuilder.f(new kl0.t(filter, 6));
        resultBuilder.h(new sk0.x(10, z0Var, filter));
        if (c1Var != filter) {
            String id3 = e0.BoardPins.getId();
            x0 x0Var = (x0) resultBuilder.f82219b;
            Intrinsics.checkNotNullParameter(x0Var, "<this>");
            Intrinsics.checkNotNullParameter(filter, "filter");
            km0.a w13 = g3.w(x0Var);
            o82.g0[] events = {new o82.e0(id3, new b1(w13 != null ? km0.a.a(w13, null, filter, 0, false, RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE) : g3.i2(x0Var, null, filter, 0, false, RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE), true)), new o82.e0(e0.BoardSections.getId(), filter != c1.AllPins ? d1.f93561a : n1.f93676a)};
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            h0 lens = this.f77016e;
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(events, "events");
            Intrinsics.checkNotNullParameter(events, "$events");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            for (o82.g0 g0Var : events) {
                lens.a(g0Var, resultBuilder);
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public final void j(l82.e r46, um0.e r47) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jm0.z.j(l82.e, um0.e):void");
    }

    public final void k(l82.e resultBuilder, boolean z13) {
        e0 e0Var = e0.BoardPins;
        String id3 = e0Var.getId();
        x0 x0Var = (x0) resultBuilder.f82219b;
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        km0.a w13 = g3.w(x0Var);
        o82.g0[] events = {new o82.e0(id3, new b1(w13 != null ? km0.a.a(w13, null, null, 0, z13, 63) : g3.i2(x0Var, null, null, 0, z13, 63), false)), new o82.e0(e0Var.getId(), new i1(new nm0.c(z13)))};
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        h0 lens = this.f77016e;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(events, "$events");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        for (o82.g0 g0Var : events) {
            lens.a(g0Var, resultBuilder);
        }
    }

    public final void l(int i13, l82.e resultBuilder, boolean z13) {
        Object obj;
        km0.e eVar;
        x0 x0Var = (x0) resultBuilder.f82219b;
        String id3 = e0.BoardSections.getId();
        String id4 = x0Var.f83907a;
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        Intrinsics.checkNotNullParameter(id4, "id");
        String sessionId = x0Var.f83909c;
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        List list = x0Var.f83915i.f93634a;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((i2) it.next()).f93619a);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (obj instanceof km0.e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        km0.e eVar2 = (km0.e) (!(obj instanceof km0.e) ? null : obj);
        if (eVar2 != null) {
            String boardId = eVar2.f80180a;
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            String boardSessionId = eVar2.f80181b;
            Intrinsics.checkNotNullParameter(boardSessionId, "boardSessionId");
            eVar = new km0.e(boardId, boardSessionId, i13);
        } else {
            Intrinsics.checkNotNullParameter(x0Var, "<this>");
            Intrinsics.checkNotNullParameter(id4, "id");
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            eVar = new km0.e(id4, sessionId, i13);
        }
        o82.g0[] events = {new o82.e0(id3, new b1(eVar, z13)), new o82.e0(e0.BoardSections.getId(), new i1(new nm0.e(i13)))};
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        h0 lens = this.f77016e;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(events, "$events");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        for (o82.g0 g0Var : events) {
            lens.a(g0Var, resultBuilder);
        }
    }

    public final void n(l82.e eVar, zo.c viewType, boolean z13) {
        x0 x0Var = (x0) eVar.f82219b;
        z0 z0Var = x0Var.f83912f;
        zo.c cVar = z0Var.f83923b;
        wa2.m mVar = x0Var.f83911e;
        c1 c1Var = lm0.a0.f83842a;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        int i13 = lm0.z.f83921a[viewType.ordinal()];
        wa2.m a13 = i13 != 1 ? i13 != 2 ? wa2.m.a(mVar, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, false, false, null, null, null, false, null, null, false, false, null, null, false, -1441793, -1, 1023) : wa2.m.a(mVar, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, null, false, false, null, null, null, false, null, null, false, false, null, null, false, -1441793, -1, 1023) : wa2.m.a(mVar, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false, false, false, false, false, null, false, false, null, null, null, false, null, null, false, false, null, null, false, -1441793, -1, 1023);
        eVar.h(new sk0.x(11, z0Var, viewType));
        eVar.f(new cj0.v(1, viewType));
        wa2.m mVar2 = ((x0) eVar.f82219b).f83911e;
        eVar.h(new kl0.t(a13, 5));
        if (!Intrinsics.d(mVar2, a13)) {
            h(eVar, a13);
        }
        if (cVar != viewType) {
            l(g3.r2(viewType, ((lm0.a) eVar.f82218a).f83839i.f122700f), eVar, z13);
        }
        eVar.a(new r0(viewType));
    }
}

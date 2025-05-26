package w9;

import a7.o0;
import a7.q;
import androidx.media3.common.ParserException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.d0;
import d7.n0;
import java.math.RoundingMode;
import q8.k0;
import q8.u;

/* loaded from: classes3.dex */
public final class a implements b {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f128484m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f128485n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER, RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE, RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO, RecyclerViewTypes.VIEW_TYPE_ICON_AND_TEXT_INLINE_BUBBLE, RecyclerViewTypes.VIEW_TYPE_TODAY_ARTICLE_BOARD_SECTION_HEADER, RecyclerViewTypes.VIEW_TYPE_AFFILIATE_LINK_IMAGE, RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER, RecyclerViewTypes.VIEW_TYPE_SHUFFLE_CAROUSEL, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final u f128486a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f128487b;

    /* renamed from: c, reason: collision with root package name */
    public final q8.c f128488c;

    /* renamed from: d, reason: collision with root package name */
    public final int f128489d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f128490e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f128491f;

    /* renamed from: g, reason: collision with root package name */
    public final int f128492g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.media3.common.b f128493h;

    /* renamed from: i, reason: collision with root package name */
    public int f128494i;

    /* renamed from: j, reason: collision with root package name */
    public long f128495j;

    /* renamed from: k, reason: collision with root package name */
    public int f128496k;

    /* renamed from: l, reason: collision with root package name */
    public long f128497l;

    public a(u uVar, k0 k0Var, q8.c cVar) {
        this.f128486a = uVar;
        this.f128487b = k0Var;
        this.f128488c = cVar;
        int max = Math.max(1, cVar.f102890d / 10);
        this.f128492g = max;
        d0 d0Var = new d0((byte[]) cVar.f102888b);
        d0Var.r();
        int r13 = d0Var.r();
        this.f128489d = r13;
        int i13 = cVar.f102889c;
        int i14 = (((cVar.f102892f - (i13 * 4)) * 8) / (cVar.f102893g * i13)) + 1;
        if (r13 != i14) {
            throw ParserException.a("Expected frames per block: " + i14 + "; got: " + r13, null);
        }
        int f13 = n0.f(max, r13);
        this.f128490e = new byte[cVar.f102892f * f13];
        this.f128491f = new d0(r13 * 2 * i13 * f13);
        int i15 = ((cVar.f102890d * cVar.f102892f) * 8) / r13;
        q qVar = new q();
        qVar.f1181n = o0.r("audio/raw");
        qVar.f1175h = i15;
        qVar.f1176i = i15;
        qVar.f1182o = max * 2 * i13;
        qVar.D = cVar.f102889c;
        qVar.E = cVar.f102890d;
        qVar.F = 2;
        this.f128493h = new androidx.media3.common.b(qVar);
    }

    @Override // w9.b
    public final void a(int i13, long j13) {
        this.f128486a.j(new e(this.f128488c, this.f128489d, i13, j13));
        androidx.media3.common.b bVar = this.f128493h;
        k0 k0Var = this.f128487b;
        k0Var.b(bVar);
        k0Var.getClass();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:50:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // w9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(q8.t r25, long r26) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.a.b(q8.t, long):boolean");
    }

    @Override // w9.b
    public final void c(long j13) {
        this.f128494i = 0;
        this.f128495j = j13;
        this.f128496k = 0;
        this.f128497l = 0L;
    }

    public final void d(int i13) {
        long j13 = this.f128495j;
        long j14 = this.f128497l;
        q8.c cVar = this.f128488c;
        long j15 = cVar.f102890d;
        int i14 = n0.f53866a;
        long g03 = j13 + n0.g0(j14, 1000000L, j15, RoundingMode.DOWN);
        int i15 = i13 * 2 * cVar.f102889c;
        this.f128487b.a(g03, 1, i15, this.f128496k - i15, null);
        this.f128497l += i13;
        this.f128496k -= i15;
    }
}

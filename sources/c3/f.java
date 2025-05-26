package c3;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f25492a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f25493b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f25494c;

    /* renamed from: d, reason: collision with root package name */
    public static final s f25495d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f25496e;

    /* renamed from: f, reason: collision with root package name */
    public static final s f25497f;

    /* renamed from: g, reason: collision with root package name */
    public static final s f25498g;

    /* renamed from: h, reason: collision with root package name */
    public static final s f25499h;

    /* renamed from: i, reason: collision with root package name */
    public static final s f25500i;

    /* renamed from: j, reason: collision with root package name */
    public static final s f25501j;

    /* renamed from: k, reason: collision with root package name */
    public static final s f25502k;

    /* renamed from: l, reason: collision with root package name */
    public static final s f25503l;

    /* renamed from: m, reason: collision with root package name */
    public static final s f25504m;

    /* renamed from: n, reason: collision with root package name */
    public static final s f25505n;

    /* renamed from: o, reason: collision with root package name */
    public static final s f25506o;

    /* renamed from: p, reason: collision with root package name */
    public static final s f25507p;

    /* renamed from: q, reason: collision with root package name */
    public static final v f25508q;

    /* renamed from: r, reason: collision with root package name */
    public static final m f25509r;

    /* renamed from: s, reason: collision with root package name */
    public static final s f25510s;

    /* renamed from: t, reason: collision with root package name */
    public static final n f25511t;

    /* renamed from: u, reason: collision with root package name */
    public static final d[] f25512u;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f25492a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f25493b = fArr2;
        t tVar = new t(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        t tVar2 = new t(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        u uVar = l.f25524d;
        s sVar = new s("sRGB IEC61966-2.1", fArr, uVar, tVar, 0);
        f25494c = sVar;
        s sVar2 = new s("sRGB IEC61966-2.1 (Linear)", fArr, uVar, 1.0d, 0.0f, 1.0f, 1);
        f25495d = sVar2;
        s sVar3 = new s("scRGB-nl IEC 61966-2-2:2003", fArr, uVar, null, new e(0), new e(1), -0.799f, 2.399f, tVar, 2);
        f25496e = sVar3;
        s sVar4 = new s("scRGB IEC 61966-2-2:2003", fArr, uVar, 1.0d, -0.5f, 7.499f, 3);
        f25497f = sVar4;
        s sVar5 = new s("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, uVar, new t(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f25498g = sVar5;
        s sVar6 = new s("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, uVar, new t(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f25499h = sVar6;
        s sVar7 = new s("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new u(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f25500i = sVar7;
        s sVar8 = new s("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, uVar, tVar, 7);
        f25501j = sVar8;
        s sVar9 = new s("NTSC (1953)", fArr2, l.f25521a, new t(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f25502k = sVar9;
        s sVar10 = new s("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, uVar, new t(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f25503l = sVar10;
        s sVar11 = new s("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, uVar, 2.2d, 0.0f, 1.0f, 10);
        f25504m = sVar11;
        s sVar12 = new s("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, l.f25522b, new t(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f25505n = sVar12;
        u uVar2 = l.f25523c;
        s sVar13 = new s("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, uVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f25506o = sVar13;
        s sVar14 = new s("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, uVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f25507p = sVar14;
        v vVar = new v(14, c.f25484b, "Generic XYZ");
        f25508q = vVar;
        long j13 = c.f25485c;
        m mVar = new m(15, j13, "Generic L*a*b*");
        f25509r = mVar;
        s sVar15 = new s("None", fArr, uVar, tVar2, 16);
        f25510s = sVar15;
        n nVar = new n(17, j13, "Oklab");
        f25511t = nVar;
        f25512u = new d[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, sVar10, sVar11, sVar12, sVar13, sVar14, vVar, mVar, sVar15, nVar};
    }
}

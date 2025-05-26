package ads_mobile_sdk;

import a.hc;
import a.xa;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public class v03 {

    /* renamed from: c, reason: collision with root package name */
    public static final v03 f12281c;

    /* renamed from: d, reason: collision with root package name */
    public static final xa f12282d;

    /* renamed from: e, reason: collision with root package name */
    public static final a.jb f12283e;

    /* renamed from: f, reason: collision with root package name */
    public static final hc f12284f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v03[] f12285g;

    /* renamed from: a, reason: collision with root package name */
    public final w03 f12286a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12287b;

    /* JADX INFO: Fake field, exist only in values array */
    v03 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    v03 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    v03 EF2;

    static {
        v03 v03Var = new v03("DOUBLE", 0, w03.DOUBLE, 1);
        v03 v03Var2 = new v03("FLOAT", 1, w03.FLOAT, 5);
        w03 w03Var = w03.LONG;
        v03 v03Var3 = new v03("INT64", 2, w03Var, 0);
        v03 v03Var4 = new v03("UINT64", 3, w03Var, 0);
        w03 w03Var2 = w03.INT;
        v03 v03Var5 = new v03("INT32", 4, w03Var2, 0);
        v03 v03Var6 = new v03("FIXED64", 5, w03Var, 1);
        v03 v03Var7 = new v03("FIXED32", 6, w03Var2, 5);
        v03 v03Var8 = new v03("BOOL", 7, w03.BOOLEAN, 0);
        f12281c = v03Var8;
        xa xaVar = new xa();
        f12282d = xaVar;
        w03 w03Var3 = w03.MESSAGE;
        a.jb jbVar = new a.jb(w03Var3);
        f12283e = jbVar;
        hc hcVar = new hc(w03Var3);
        f12284f = hcVar;
        final w03 w03Var4 = w03.BYTE_STRING;
        f12285g = new v03[]{v03Var, v03Var2, v03Var3, v03Var4, v03Var5, v03Var6, v03Var7, v03Var8, xaVar, jbVar, hcVar, new v03(w03Var4) { // from class: a.kd
        }, new v03("UINT32", 12, w03Var2, 0), new v03("ENUM", 13, w03.ENUM, 0), new v03("SFIXED32", 14, w03Var2, 5), new v03("SFIXED64", 15, w03Var, 1), new v03("SINT32", 16, w03Var2, 0), new v03("SINT64", 17, w03Var, 0)};
    }

    public v03(String str, int i13, w03 w03Var, int i14) {
        this.f12286a = w03Var;
        this.f12287b = i14;
    }

    public static v03[] values() {
        return (v03[]) f12285g.clone();
    }
}

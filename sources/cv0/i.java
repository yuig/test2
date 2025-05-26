package cv0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class i extends z {

    /* renamed from: b, reason: collision with root package name */
    public final Integer f53265b;

    /* renamed from: c, reason: collision with root package name */
    public final int f53266c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f53267d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f53268e;

    /* renamed from: f, reason: collision with root package name */
    public final rm1.q f53269f;

    /* renamed from: g, reason: collision with root package name */
    public final String f53270g;

    /* renamed from: h, reason: collision with root package name */
    public final Function0 f53271h;

    private i(Integer num, int i13, Integer num2, Integer num3, rm1.q qVar, String str, Function0<Unit> function0) {
        super(1, null);
        this.f53265b = num;
        this.f53266c = i13;
        this.f53267d = num2;
        this.f53268e = num3;
        this.f53269f = qVar;
        this.f53270g = str;
        this.f53271h = function0;
    }

    public /* synthetic */ i(Integer num, int i13, Integer num2, Integer num3, rm1.q qVar, String str, Function0 function0, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : num, i13, (i14 & 4) != 0 ? null : num2, (i14 & 8) != 0 ? null : num3, (i14 & 16) != 0 ? null : qVar, (i14 & 32) != 0 ? null : str, (i14 & 64) != 0 ? b.f53260j : function0, null);
    }

    public /* synthetic */ i(Integer num, int i13, Integer num2, Integer num3, rm1.q qVar, String str, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, i13, num2, num3, qVar, str, function0);
    }
}

package wb1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import va1.j1;

/* loaded from: classes5.dex */
public abstract class n extends j1 {

    /* renamed from: e, reason: collision with root package name */
    public final int f129039e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f129040f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f129041g;

    private n(int i13, Integer num, boolean z13) {
        super(num, null, 2, 0 == true ? 1 : 0);
        this.f129039e = i13;
        this.f129040f = num;
        this.f129041g = z13;
    }

    public /* synthetic */ n(int i13, Integer num, boolean z13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, num, (i14 & 4) != 0 ? true : z13, null);
    }

    public /* synthetic */ n(int i13, Integer num, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, num, z13);
    }
}

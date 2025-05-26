package va1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class m1 extends j1 implements b {

    /* renamed from: e, reason: collision with root package name */
    public boolean f125210e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f125211f;

    /* renamed from: g, reason: collision with root package name */
    public final int f125212g;

    public /* synthetic */ m1(Integer num, boolean z13, String str, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, z13, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? true : z14);
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f125212g;
    }

    @Override // va1.j1
    public boolean h() {
        return this.f125211f;
    }

    public m1(Integer num, boolean z13, String str, boolean z14) {
        super(num, str);
        this.f125210e = z13;
        this.f125211f = z14;
        this.f125212g = 3;
    }
}

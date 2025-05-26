package wo2;

import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class v extends kotlin.collections.h implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f130737d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final m[] f130738b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f130739c;

    public v(m[] mVarArr, int[] iArr) {
        this.f130738b = mVarArr;
        this.f130739c = iArr;
    }

    @Override // kotlin.collections.b
    public final int b() {
        return this.f130738b.length;
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof m) {
            return super.contains((m) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        return this.f130738b[i13];
    }

    @Override // kotlin.collections.h, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof m) {
            return super.indexOf((m) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.h, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof m) {
            return super.lastIndexOf((m) obj);
        }
        return -1;
    }
}

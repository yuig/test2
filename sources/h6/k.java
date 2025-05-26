package h6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f67725a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67726b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(j jVar, int i13) {
        this(Arrays.asList(jVar), i13, null);
        com.bumptech.glide.d.s(jVar, "initCallback cannot be null");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f67725a;
        int size = arrayList.size();
        int i13 = 0;
        if (this.f67726b != 1) {
            while (i13 < size) {
                ((j) arrayList.get(i13)).a();
                i13++;
            }
        } else {
            while (i13 < size) {
                ((j) arrayList.get(i13)).b();
                i13++;
            }
        }
    }

    public k(List list, int i13, Throwable th3) {
        com.bumptech.glide.d.s(list, "initCallbacks cannot be null");
        this.f67725a = new ArrayList(list);
        this.f67726b = i13;
    }
}

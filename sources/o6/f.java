package o6;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class f extends ArrayList {

    /* renamed from: a, reason: collision with root package name */
    public final Class f92922a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f92923b;

    public f(Class cls, Class cls2) {
        this.f92922a = cls;
        this.f92923b = cls2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.appcompat.app.d b() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f92922a, size);
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.f92923b, size);
        for (int i13 = 0; i13 < size; i13++) {
            objArr[i13] = ((Pair) get(i13)).first;
            objArr2[i13] = ((Pair) get(i13)).second;
        }
        return new androidx.appcompat.app.d(objArr, objArr2);
    }
}

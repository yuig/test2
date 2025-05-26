package qm;

import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes.dex */
public final class g0 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.hasNext()) {
            try {
                arrayList.add(Integer.valueOf(aVar.o0()));
            } catch (NumberFormatException e13) {
                throw new JsonSyntaxException(e13);
            }
        }
        aVar.f();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i13 = 0; i13 < size; i13++) {
            atomicIntegerArray.set(i13, ((Integer) arrayList.get(i13)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        cVar.c();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i13 = 0; i13 < length; i13++) {
            cVar.J(r6.get(i13));
        }
        cVar.f();
    }
}

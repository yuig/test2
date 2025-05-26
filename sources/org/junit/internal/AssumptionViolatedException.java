package org.junit.internal;

import java.io.ObjectOutputStream;
import t72.j;
import up2.a;
import up2.b;

/* loaded from: classes4.dex */
public class AssumptionViolatedException extends RuntimeException implements b {
    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("fAssumption", (Object) null);
        putFields.put("fValueMatcher", false);
        putFields.put("fMatcher", (Object) null);
        putFields.put("fValue", (Object) null);
        objectOutputStream.writeFields();
    }

    @Override // up2.b
    public final void a(a aVar) {
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return j.p(this);
    }
}

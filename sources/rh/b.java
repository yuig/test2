package rh;

import ai.k;
import android.os.IBinder;
import android.os.IInterface;
import com.bumptech.glide.d;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class b extends k implements a {

    /* renamed from: b */
    public final Object f108102b;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 1);
        this.f108102b = obj;
    }

    public static a D(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new c(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }

    public static Object E(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f108102b;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i13 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i13++;
                field = field2;
            }
        }
        if (i13 != 1) {
            throw new IllegalArgumentException(a.a.d("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
        d.t(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e13) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e13);
        } catch (NullPointerException e14) {
            throw new IllegalArgumentException("Binder object is null.", e14);
        }
    }
}

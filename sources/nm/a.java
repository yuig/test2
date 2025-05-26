package nm;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public enum a extends h {
    public a(String str, int i13) {
        super(str, i13, null);
    }

    @Override // nm.h, nm.i
    public String translateName(Field field) {
        return field.getName();
    }
}

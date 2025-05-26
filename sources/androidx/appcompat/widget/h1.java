package androidx.appcompat.widget;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f16579a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e13) {
            e13.printStackTrace();
        }
        f16579a = field;
    }
}

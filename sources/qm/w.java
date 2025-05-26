package qm;

import com.google.gson.JsonIOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f104223a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f104224b;

    /* renamed from: c, reason: collision with root package name */
    public final String f104225c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f104226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Method f104227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nm.i0 f104228f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nm.i0 f104229g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f104230h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f104231i;

    public w(String str, Field field, boolean z13, Method method, nm.i0 i0Var, nm.i0 i0Var2, boolean z14, boolean z15) {
        this.f104226d = z13;
        this.f104227e = method;
        this.f104228f = i0Var;
        this.f104229g = i0Var2;
        this.f104230h = z14;
        this.f104231i = z15;
        this.f104223a = str;
        this.f104224b = field;
        this.f104225c = field.getName();
    }

    public final void a(um.c cVar, Object obj) {
        Object obj2;
        boolean z13 = this.f104226d;
        Field field = this.f104224b;
        Method method = this.f104227e;
        if (z13) {
            if (method == null) {
                b0.b(obj, field);
            } else {
                b0.b(obj, method);
            }
        }
        if (method != null) {
            try {
                obj2 = method.invoke(obj, new Object[0]);
            } catch (InvocationTargetException e13) {
                throw new JsonIOException(a.a.k("Accessor ", sm.c.e(method, false), " threw exception"), e13.getCause());
            }
        } else {
            obj2 = field.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        cVar.h(this.f104223a);
        this.f104228f.e(cVar, obj2);
    }
}

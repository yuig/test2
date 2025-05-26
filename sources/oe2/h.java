package oe2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class h extends kh2.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f94336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executable f94337c;

    public /* synthetic */ h(Executable executable, Class cls, int i13) {
        this.f94335a = i13;
        this.f94337c = executable;
        this.f94336b = cls;
    }

    @Override // kh2.w
    public final Object p0() {
        int i13 = this.f94335a;
        Executable executable = this.f94337c;
        switch (i13) {
            case 0:
                return ((Constructor) executable).newInstance(null);
            default:
                return ((Method) executable).invoke(null, this.f94336b, Object.class);
        }
    }

    public final String toString() {
        int i13 = this.f94335a;
        Class cls = this.f94336b;
        switch (i13) {
        }
        return cls.getName();
    }
}

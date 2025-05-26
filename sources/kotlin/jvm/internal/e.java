package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class e implements rl2.c, Serializable {
    public static final Object NO_RECEIVER = d.f80422a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient rl2.c reflected;
    private final String signature;

    public e() {
        this(NO_RECEIVER, null, null, null, false);
    }

    @Override // rl2.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // rl2.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public rl2.c compute() {
        rl2.c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        rl2.c computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract rl2.c computeReflected();

    @Override // rl2.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // rl2.c
    public String getName() {
        return this.name;
    }

    public rl2.f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? k0.f80436a.c(cls, "") : k0.f80436a.b(cls);
    }

    @Override // rl2.c
    public List<rl2.o> getParameters() {
        return getReflected().getParameters();
    }

    public rl2.c getReflected() {
        rl2.c compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new jl2.a();
    }

    @Override // rl2.c
    public rl2.v getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // rl2.c
    public List<rl2.w> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // rl2.c
    public rl2.a0 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // rl2.c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // rl2.c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // rl2.c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // rl2.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public e(Object obj, Class cls, String str, String str2, boolean z13) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z13;
    }
}

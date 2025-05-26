package rl2;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface c extends b {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    v getReturnType();

    List getTypeParameters();

    a0 getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}

package o10;

import com.pinterest.api.model.ow;
import com.pinterest.api.model.yj0;
import com.pinterest.api.model.zj0;
import dl1.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final i f92774a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final c f92775b = c.f92770a;

    private i() {
    }

    @Override // o10.e
    public final void a(s sVar, ow modelStorage) {
        zj0 model = (zj0) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        modelStorage.a(model);
        ArrayList arrayList = new ArrayList();
        List<yj0> G = model.G();
        if (G != null) {
            for (yj0 yj0Var : G) {
                j jVar = k.f92776a;
                Object value12 = yj0Var.f44057a;
                if (value12 != null) {
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(value12, "value0");
                } else {
                    value12 = yj0Var.f44058b;
                    if (value12 != null) {
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(value12, "value1");
                    } else {
                        value12 = yj0Var.f44059c;
                        if (value12 != null) {
                            jVar.getClass();
                            Intrinsics.checkNotNullParameter(value12, "value2");
                        } else {
                            value12 = yj0Var.f44060d;
                            if (value12 != null) {
                                jVar.getClass();
                                Intrinsics.checkNotNullParameter(value12, "value3");
                            } else {
                                value12 = yj0Var.f44061e;
                                if (value12 != null) {
                                    jVar.getClass();
                                    Intrinsics.checkNotNullParameter(value12, "value4");
                                } else {
                                    value12 = yj0Var.f44062f;
                                    if (value12 != null) {
                                        jVar.getClass();
                                        Intrinsics.checkNotNullParameter(value12, "value5");
                                    } else {
                                        value12 = yj0Var.f44063g;
                                        if (value12 != null) {
                                            jVar.getClass();
                                            Intrinsics.checkNotNullParameter(value12, "value6");
                                        } else {
                                            value12 = yj0Var.f44064h;
                                            if (value12 != null) {
                                                jVar.getClass();
                                                Intrinsics.checkNotNullParameter(value12, "value7");
                                            } else {
                                                value12 = yj0Var.f44065i;
                                                if (value12 != null) {
                                                    jVar.getClass();
                                                    Intrinsics.checkNotNullParameter(value12, "value8");
                                                } else {
                                                    value12 = yj0Var.f44066j;
                                                    if (value12 != null) {
                                                        jVar.getClass();
                                                        Intrinsics.checkNotNullParameter(value12, "value9");
                                                    } else {
                                                        value12 = yj0Var.f44067k;
                                                        if (value12 != null) {
                                                            jVar.getClass();
                                                            Intrinsics.checkNotNullParameter(value12, "value10");
                                                        } else {
                                                            value12 = yj0Var.f44068l;
                                                            if (value12 != null) {
                                                                jVar.getClass();
                                                                Intrinsics.checkNotNullParameter(value12, "value11");
                                                            } else {
                                                                value12 = yj0Var.f44069m;
                                                                if (value12 != null) {
                                                                    jVar.getClass();
                                                                    Intrinsics.checkNotNullParameter(value12, "value12");
                                                                } else {
                                                                    value12 = null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (value12 != null) {
                    arrayList.add(value12);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            s sVar2 = (s) it.next();
            e a13 = f92775b.a(sVar2);
            if (a13 != null) {
                a13.a(sVar2, modelStorage);
            }
        }
    }
}

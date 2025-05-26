package com.bugsnag.android;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class s2 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f29636a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public s2(ArrayList arrayList) {
        this.f29636a = arrayList.size() >= 200 ? arrayList.subList(0, 200) : arrayList;
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        o1Var.c();
        Iterator it = this.f29636a.iterator();
        while (it.hasNext()) {
            o1Var.M((r2) it.next());
        }
        o1Var.f();
    }

    public s2(StackTraceElement[] stackTraceElementArr, Collection collection, u1 u1Var) {
        String methodName;
        Boolean bool;
        int min = Math.min(200, stackTraceElementArr.length);
        this.f29636a = new ArrayList(min);
        int i13 = 0;
        while (i13 < min) {
            int i14 = i13 + 1;
            StackTraceElement stackTraceElement = stackTraceElementArr[i13];
            r2 r2Var = null;
            try {
                String className = stackTraceElement.getClassName();
                if (className.length() > 0) {
                    methodName = className + '.' + ((Object) stackTraceElement.getMethodName());
                } else {
                    methodName = stackTraceElement.getMethodName();
                }
                String str = methodName;
                String fileName = stackTraceElement.getFileName();
                String str2 = fileName == null ? "Unknown" : fileName;
                Integer valueOf = Integer.valueOf(stackTraceElement.getLineNumber());
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (kotlin.text.z.p(className, (String) it.next(), false)) {
                            bool = Boolean.TRUE;
                            break;
                        }
                    }
                }
                bool = null;
                r2Var = new r2(str, str2, valueOf, bool, 48);
            } catch (Exception e13) {
                u1Var.a("Failed to serialize stacktrace", e13);
            }
            if (r2Var != null) {
                this.f29636a.add(r2Var);
            }
            i13 = i14;
        }
    }
}

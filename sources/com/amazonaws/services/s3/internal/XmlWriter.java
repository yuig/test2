package com.amazonaws.services.s3.internal;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public class XmlWriter {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28823a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f28824b = new StringBuilder();

    public final void a() {
        String str = (String) this.f28823a.remove(r0.size() - 1);
        StringBuilder sb3 = this.f28824b;
        sb3.append("</");
        sb3.append(str);
        sb3.append(">");
    }

    public final void b(String str) {
        StringBuilder sb3 = this.f28824b;
        sb3.append("<");
        sb3.append(str);
        sb3.append(">");
        this.f28823a.add(str);
    }

    public final void c(String str) {
        StringBuilder sb3;
        if (str == null) {
            str = "";
        }
        int length = str.length();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            sb3 = this.f28824b;
            if (i13 >= length) {
                break;
            }
            char charAt = str.charAt(i13);
            String str2 = charAt != '\t' ? charAt != '\n' ? charAt != '\r' ? charAt != '\"' ? charAt != '&' ? charAt != '<' ? charAt != '>' ? null : "&gt;" : "&lt;" : "&amp;" : "&quot;" : "&#13;" : "&#10;" : "&#9;";
            if (str2 != null) {
                if (i14 < i13) {
                    sb3.append((CharSequence) str, i14, i13);
                }
                sb3.append(str2);
                i14 = i13 + 1;
            }
            i13++;
        }
        if (i14 < i13) {
            sb3.append((CharSequence) str, i14, i13);
        }
    }

    public final String toString() {
        return this.f28824b.toString();
    }
}

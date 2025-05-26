package com.github.mustachejava;

import a.a;

/* loaded from: classes3.dex */
public class MustacheNotFoundException extends MustacheException {
    public MustacheNotFoundException(String str) {
        super(a.k("Template ", str, " not found"));
    }
}

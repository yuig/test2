package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: a, reason: collision with root package name */
    public final List f33720a;

    public DependencyCycleException(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
    }
}

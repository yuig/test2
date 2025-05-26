package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class i0 extends a {
    private final n0 defaultInstance;
    protected n0 instance;

    public i0(n0 n0Var) {
        this.defaultInstance = n0Var;
        if (n0Var.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = n0Var.newMutableInstance();
    }

    public final void copyOnWrite() {
        if (this.instance.isMutable()) {
            return;
        }
        copyOnWriteInternal();
    }

    public void copyOnWriteInternal() {
        n0 newMutableInstance = this.defaultInstance.newMutableInstance();
        z1.f34015c.b(newMutableInstance).a(newMutableInstance, this.instance);
        this.instance = newMutableInstance;
    }

    public final boolean isInitialized() {
        return n0.isInitialized(this.instance, false);
    }

    /* renamed from: build, reason: merged with bridge method [inline-methods] */
    public final n0 m101build() {
        n0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw a.newUninitializedMessageException(buildPartial);
    }

    @Override // com.google.protobuf.n1
    public n0 buildPartial() {
        if (!this.instance.isMutable()) {
            return this.instance;
        }
        this.instance.makeImmutable();
        return this.instance;
    }

    /* renamed from: clear, reason: merged with bridge method [inline-methods] */
    public final i0 m102clear() {
        if (this.defaultInstance.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = this.defaultInstance.newMutableInstance();
        return this;
    }

    @Override // com.google.protobuf.p1
    public n0 getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    @Override // com.google.protobuf.a
    public i0 internalMergeFrom(n0 n0Var) {
        return mergeFrom(n0Var);
    }

    /* renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public i0 m105clone() {
        i0 newBuilderForType = getDefaultInstanceForType().newBuilderForType();
        newBuilderForType.instance = buildPartial();
        return newBuilderForType;
    }

    public i0 mergeFrom(n0 n0Var) {
        if (getDefaultInstanceForType().equals(n0Var)) {
            return this;
        }
        copyOnWrite();
        n0 n0Var2 = this.instance;
        z1.f34015c.b(n0Var2).a(n0Var2, n0Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public i0 m108mergeFrom(byte[] bArr, int i13, int i14, y yVar) {
        copyOnWrite();
        try {
            z1.f34015c.b(this.instance).j(this.instance, bArr, i13, i13 + i14, new l7.v(yVar));
            return this;
        } catch (InvalidProtocolBufferException e13) {
            throw e13;
        } catch (IOException e14) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e14);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public i0 m107mergeFrom(byte[] bArr, int i13, int i14) {
        return m108mergeFrom(bArr, i13, i14, y.a());
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public i0 m106mergeFrom(p pVar, y yVar) {
        copyOnWrite();
        try {
            z1.f34015c.b(this.instance).i(this.instance, r.a(pVar), yVar);
            return this;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof IOException) {
                throw ((IOException) e13.getCause());
            }
            throw e13;
        }
    }
}

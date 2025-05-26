package w01;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.ow;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import i01.u0;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127045i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ PinCloseupPresenter f127046j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(PinCloseupPresenter pinCloseupPresenter, int i13) {
        super(0);
        this.f127045i = i13;
        this.f127046j = pinCloseupPresenter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r0 != false) goto L21;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean invoke() {
        /*
            r6 = this;
            int r0 = r6.f127045i
            r1 = 1
            r2 = 0
            com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter r3 = r6.f127046j
            switch(r0) {
                case 1: goto L56;
                case 5: goto L2d;
                default: goto L9;
            }
        L9:
            lh0.a0 r0 = com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$getExperiments$p(r3)
            r0.getClass()
            lh0.z3 r3 = lh0.a4.f83298b
            lh0.z0 r0 = r0.f83294a
            lh0.g1 r0 = (lh0.g1) r0
            java.lang.String r4 = "enabled"
            java.lang.String r5 = "sg_android_reply_to_external_share_in_conversation"
            boolean r3 = r0.o(r5, r4, r3)
            if (r3 != 0) goto L28
            boolean r0 = r0.l(r5)
            if (r0 == 0) goto L27
            goto L28
        L27:
            r1 = r2
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L2d:
            p01.n r0 = com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$getRelatedPinsFilteringDataManager$p(r3)
            java.util.LinkedHashMap r0 = r0.f98392h
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            if (r0 != 0) goto L50
            p01.f r0 = com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$getOneBarFilteringDataManager$p(r3)
            p01.a r0 = r0.f98367g
            p01.a r4 = p01.a.FILTERED
            if (r0 != r4) goto L45
            goto L50
        L45:
            com.pinterest.api.model.f30 r0 = com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$getPin$p(r3)
            boolean r0 = com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$isPinEligibleToLoadRelatedModules(r3, r0)
            if (r0 == 0) goto L50
            goto L51
        L50:
            r1 = r2
        L51:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L56:
            lh0.a0 r0 = com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter.access$getExperiments$p(r3)
            boolean r0 = r0.K()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w01.j.invoke():java.lang.Boolean");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HashMap commerceAuxData;
        HashMap commerceAuxData2;
        HashMap commerceAuxData3;
        f30 f30Var;
        com.pinterest.feature.pin.closeup.datasource.k relatedModulesFetchedList;
        ow owVar;
        d12.i iVar;
        HashMap commerceAuxData4;
        HashMap commerceAuxData5;
        HashMap commerceAuxData6;
        HashMap commerceAuxData7;
        HashMap commerceAuxData8;
        HashMap commerceAuxData9;
        int i13 = this.f127045i;
        PinCloseupPresenter pinCloseupPresenter = this.f127046j;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        commerceAuxData = pinCloseupPresenter.getCommerceAuxData();
                        return commerceAuxData;
                    case 4:
                        commerceAuxData2 = pinCloseupPresenter.getCommerceAuxData();
                        return commerceAuxData2;
                    default:
                        commerceAuxData3 = pinCloseupPresenter.getCommerceAuxData();
                        return commerceAuxData3;
                }
            case 1:
                return invoke();
            case 2:
                f30Var = pinCloseupPresenter.pin;
                return f30Var;
            case 3:
                relatedModulesFetchedList = pinCloseupPresenter.getRelatedModulesFetchedList();
                com.pinterest.feature.pin.closeup.datasource.l relatedPinsPagedList = pinCloseupPresenter.getRelatedPinsPagedList();
                PinCloseupPresenter pinCloseupPresenter2 = this.f127046j;
                owVar = pinCloseupPresenter2.modelStorage;
                iVar = pinCloseupPresenter.repositoryBatcher;
                return new u0(relatedModulesFetchedList, relatedPinsPagedList, pinCloseupPresenter2, owVar, iVar);
            case 4:
                switch (i13) {
                    case 0:
                        commerceAuxData4 = pinCloseupPresenter.getCommerceAuxData();
                        return commerceAuxData4;
                    case 4:
                        commerceAuxData5 = pinCloseupPresenter.getCommerceAuxData();
                        return commerceAuxData5;
                    default:
                        commerceAuxData6 = pinCloseupPresenter.getCommerceAuxData();
                        return commerceAuxData6;
                }
            case 5:
                return invoke();
            case 6:
                switch (i13) {
                    case 0:
                        commerceAuxData7 = pinCloseupPresenter.getCommerceAuxData();
                        return commerceAuxData7;
                    case 4:
                        commerceAuxData8 = pinCloseupPresenter.getCommerceAuxData();
                        return commerceAuxData8;
                    default:
                        commerceAuxData9 = pinCloseupPresenter.getCommerceAuxData();
                        return commerceAuxData9;
                }
            default:
                return invoke();
        }
    }
}

/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.progress;

import java.util.Arrays;

import org.mockito.internal.verification.VerificationMode;
import org.mockito.internal.verification.VerificationModeImpl;

public class VerificationModeBuilder {

    private Integer times = 1;

    public VerificationMode inOrder() {
        return VerificationModeImpl.inOrder(times, Arrays.asList(new Object()));
    }

    public VerificationModeBuilder times(int times) {
        this.times = times;
        return this;
    }
}
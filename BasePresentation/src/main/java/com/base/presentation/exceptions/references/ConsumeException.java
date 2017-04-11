package com.base.presentation.exceptions.references;


import com.base.abstraction.exceptions.CheckedReferenceClearedException;
import com.base.presentation.references.Consumable;

/**
 * a {@link RuntimeException} that is thrown when attempting to invoke {@link Consumable#get()}
 * while the object was already consumed
 * <p>
 * notice that this exception extends {@link CheckedReferenceClearedException}, it will be
 * handled in it's catch clause as well
 * <p>
 * Created by Ahmed Adel on 12/28/2016.
 */
public class ConsumeException extends CheckedReferenceClearedException {

}
